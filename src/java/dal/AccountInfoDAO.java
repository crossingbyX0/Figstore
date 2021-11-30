/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Account;
import model.AccountInfo;

/**
 *
 * @author atung
 */
public class AccountInfoDAO extends DBContext {

    public AccountInfo getCustomer(String username) {
        String sql = "SELECT * FROM dbo.AccountInfo WHERE username = ?";
        AccountInfo acc = null;
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, username);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                acc = new AccountInfo();
                acc.setUserName(username);
                acc.setName(rs.getString(2));
                acc.setAddress(rs.getString(3));
                acc.setDate(rs.getString(4));
                acc.setPhone(rs.getString(5));
            }
        } catch (SQLException e) {
            System.out.println("lay ra thong tin khach hang");
        }
        return acc;
    }

    public void updateCustomer(String username, String newname, String newadd, String newphone) {
        String sql = "UPDATE dbo.AccountInfo SET name = ? , [address] = ? , phone = ? WHERE username = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, newname);
            st.setString(2, newadd);
            st.setString(3, newphone);
            st.setString(4, username);
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        AccountInfoDAO adb = new AccountInfoDAO();
        Account acc = new Account();
        adb.getCustomer("cuong");
        adb.updateCustomer("cuong", "le kim cuong", "Fpt Hoa lac", "012456");
        adb.getCustomer("cuong");
        System.out.println(adb.getCustomer("cuong"));
        System.out.println(acc.getUserName());
        System.out.println(adb.getCustomer("cuong"));

    }
}
