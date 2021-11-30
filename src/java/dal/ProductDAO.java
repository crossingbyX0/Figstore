/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Origin;

import model.Product;
import model.brand;

/**
 *
 * @author atung
 */
public class ProductDAO extends DBContext {

    public List<Product> getProductAll() {
        List<Product> list = new ArrayList<>();
        String sql = "select p.Id, p.name, p.image, p.price, p.quantity, p.des from Product p";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getInt("price"));
                p.setQuantity(rs.getInt("quantity"));
                p.setDes(rs.getString("des"));
                list.add(p);
            }

        } catch (SQLException e) {
        }
        return list;
    }

    public List<Product> getProductTop() {
        List<Product> list = new ArrayList<>();
        String sql = "select p.Id, p.name, p.image, p.price, p.quantity, p.des from Product p\n"
                + " WHERE p.Id <9";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getInt("price"));

                p.setQuantity(rs.getInt("quantity"));
                p.setDes(rs.getString("des"));
                list.add(p);
            }

        } catch (SQLException e) {
        }
        return list;
    }

    public List<Product> getProductCheap() {
        List<Product> list = new ArrayList<>();
        String sql = "select p.Id, p.name, p.image, p.price, p.quantity, p.des from Product p\n"
                + " WHERE p.price < 700000 and p.price> 450000";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getInt("price"));

                p.setQuantity(rs.getInt("quantity"));
                p.setDes(rs.getString("des"));
                list.add(p);
            }

        } catch (SQLException e) {
        }
        return list;
    }

    public List<Product> getProductbyBrand(int brandId) {
        List<Product> list = new ArrayList<>();
        String sql = "select p.Id, p.name, p.price, p.image, p.quantity, p.des, br.brandId, br.brand, br.originId from Product p, brand br \n"
                + " WHERE p.brandId = br.brandId AND br.brandId=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, brandId);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setPrice(rs.getInt("price"));
                p.setImage(rs.getString("image"));
                p.setQuantity(rs.getInt("quantity"));
                p.setDes(rs.getString("des"));
                p.setBrandId(rs.getInt("brandId"));

                list.add(p);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public Product getProductbyId(String id) {
        String sql = "select * from Product where id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);

            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getInt("price"));
                p.setQuantity(rs.getInt("quantity"));
                p.setDes(rs.getString("des"));
                p.setBrandId(rs.getInt("brandId"));
                return p;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public List<Product> SearchProduct(String key) {
        List<Product> list = new ArrayList<>();
        String sql = "select p.Id, p.name, p.image, p.price, p.quantity, p.des from Product p \n"
                + " WHERE p.name LIKE '%" + key + "%'";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getInt("price"));
                p.setQuantity(rs.getInt("quantity"));
                p.setDes(rs.getString("des"));
                list.add(p);
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        return list;
    }

    public List<Product> getProductbyPage(List<Product> list,
            int start, int end) {
        List<Product> t = new ArrayList<>();
        for (int i = start; i < end; i++) {
            t.add(list.get(i));
        }
        return t;

    }

    public List<Product> getAllProductCRUD() {
        List<Product> list = new ArrayList<>();
        String sql = "SELECT p.Id, p.name, p.image, p.price, p.quantity, p.des, p.brandId, br.brand, br.originId\n"
                + " FROM dbo.Product p, dbo.brand br WHERE p.brandId=br.brandId";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Product p = new Product();
                p.setId(rs.getString("id"));
                p.setName(rs.getString("name"));
                p.setImage(rs.getString("image"));
                p.setPrice(rs.getInt("price"));
                p.setQuantity(rs.getInt("quantity"));
                p.setDes(rs.getString("des"));
                p.setBrandId(rs.getInt("brandId"));
                list.add(p);
            }

        } catch (SQLException e) {
        }
        return list;
    }

    public int deleteProduct(String id) {
        String sql = "delete from Product \n"
                + "where id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public int add(Product p) {
        String sql = "insert into Product values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, p.getId());
            st.setString(2, p.getName());
            st.setInt(3, p.getBrandId());
            st.setInt(4, p.getPrice());
            st.setInt(5, p.getQuantity());
            st.setString(6, p.getDes());
            st.setString(7, p.getImage());
            return st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public int update(Product p) {
        //chuan duong dan sql
        String sql = "Update Product set name=?,brandId=?, price=?,"
                + " quantity=?, des=?, image=? where id=?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);

            st.setString(1, p.getName());
            st.setInt(2, p.getBrandId());
            st.setInt(3, p.getPrice());
            st.setInt(4, p.getQuantity());
            st.setString(5, p.getDes());
            st.setString(6, p.getImage());
            st.setString(7, p.getId());
            return st.executeUpdate();

        } catch (SQLException e) {

            System.out.println(e);
        }

        return 0;
    }
}
