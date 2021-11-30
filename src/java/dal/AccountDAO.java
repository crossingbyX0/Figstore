/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import com.sun.xml.xsom.SCD;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Account;
import model.AccountInfo;

/**
 *
 * @author atung
 */
public class AccountDAO extends DBContext {

    public Account getAccount(String user, String pass) {
        String sql = "select userName, password,role from Account where userName = ? and password = ?";

        try {

            PreparedStatement st = connection.prepareStatement(sql);
            System.out.println(sql);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Account a = new Account();
                a.setUserName(rs.getString("userName"));
                a.setPassword(rs.getString("password"));
                a.setRole(rs.getString("role"));
                return a;
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        System.out.println(sql);
        return null;
    }

    public int create(Account a) {
        String sql = "insert into Account values(?,?,?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, a.getUserName());
            st.setString(2, a.getPassword());
            st.setString(3, "user");
            return st.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }
        return 0;
    }

    public int insertAccInfo(AccountInfo acc) {
        String sql = "insert into AccountInfo values (?, ?, ?, ?, ?)";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, acc.getUserName());
            st.setString(2, acc.getName());
            st.setString(3, acc.getAddress());
            st.setString(4, acc.getDate());
            st.setString(5, acc.getPhone());
            return st.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }



    public void updateAccount(String username, String newpass) {
        String sql = "UPDATE dbo.account SET password = ? WHERE username = ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, newpass);
            st.setString(2, username);
            st.executeQuery();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }



}
