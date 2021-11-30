/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Account;
import model.AccountInfo;
import model.Cart;
import model.Item;
import model.Order;

/**
 *
 * @author atung
 */
public class OrderDAO extends DBContext {

    public void addOrder(Order order, Cart cart) {
        LocalDate curDate = java.time.LocalDate.now();
        String date = curDate.toString();
        try {
            //add vào bảng Order
            String sql = "insert into [Order] values(?,?,?)";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, order.getUserName());
            st.setString(2, date);
            st.setDouble(3, order.getTotalMoney());
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Add vao order");
        }
        try {
            //lấy ra id của Order vừa add
            String sql1 = "select top 1 OrderId from [Order] order by OrderId desc";
            PreparedStatement st1 = connection.prepareStatement(sql1);
            ResultSet rs = st1.executeQuery();

            //add vào bảng orderdetail
            if (rs.next()) {
                int oid = rs.getInt(1);
                for (Item i : cart.getItems()) {
                    String sql2 = "insert into OrderDetail values(?,?,?,?)";
                    PreparedStatement st2 = connection.prepareStatement(sql2);

                    st2.setString(1, i.getProduct().getId());
                    st2.setInt(2, oid);
                    st2.setInt(3, i.getQuantity());
                    st2.setInt(4, i.getPrice());
                    st2.executeUpdate();
                }
            }

        } catch (SQLException e) {
            System.out.println("Them vao detail nhung o ngoai");
        }

        //update so luong trong bang Product sau khi ban
        String sql3 = "update Product set quantity = quantity - ? "
                + "where id = ?";
        for (Item i : cart.getItems()) {
            try {
                PreparedStatement st3 = connection.prepareStatement(sql3);

                st3.setInt(1, i.getQuantity());
                st3.setString(2, i.getProduct().getId());
                st3.executeUpdate();
            } catch (SQLException e) {
                System.out.println("update storage");
            }

        }

    }

    public int getOrderNum(String username) {
        int orderNum = 0;
        String sql = "SELECT userName, COUNT(OrderId) AS orderNum FROM dbo.[Order] WHERE userName = ?  GROUP BY userName";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                orderNum = rs.getInt(2);
            }
        } catch (SQLException ex) {
            System.out.println("lay so luong don hang");
        }
        return orderNum;
    }

    public Order getOrderByID(int oid) {
        Order o = new Order();
        String sql = "SELECT * FROM dbo.[Order] WHERE orderID  = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, oid);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                o.setId(rs.getInt(1));
                o.setUserName(rs.getString(2));
                o.setDate(rs.getString(3));
                o.setTotalMoney(rs.getInt(4));
            }
        } catch (SQLException ex) {
            System.out.println("lay tat ca don hang");
        }
        return o;
    }

    public List<Order> getAllOrder(String username) {
        List<Order> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.[Order] WHERE userName = ? ORDER BY orderID ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Order o = new Order();
                o.setId(rs.getInt(1));

                o.setUserName(username);
                o.setDate(rs.getString(3));
                o.setTotalMoney(rs.getInt(4));

                list.add(o);
            }
        } catch (SQLException ex) {
            System.out.println("lay tat ca don hang");
        }
        return list;

    }

    public List<Order> getAllOrderADMIN() {
        List<Order> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.[Order] ORDER BY orderID desc";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Order o = new Order();
                o.setId(rs.getInt(1));
                o.setUserName(rs.getString(2));
                o.setDate(rs.getString(3));

                o.setTotalMoney(rs.getInt(4));

                list.add(o);
            }
        } catch (SQLException ex) {
            System.out.println("lay tat ca don hang");
        }
        return list;

    }

    public List<Item> getDetails(int oid) {
        List<Item> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.orderDetail WHERE orderId = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, oid);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Item i = new Item();
                ProductDAO pdb = new ProductDAO();
                i.setProduct(pdb.getProductbyId(rs.getString(1)));
                i.setQuantity(rs.getInt(3));
                i.setPrice(rs.getInt(4));

                list.add(i);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public static void main(String[] args) {
        OrderDAO odb = new OrderDAO();
        odb.getDetails(2);
        System.out.println(odb.getDetails(2));

    }
}
