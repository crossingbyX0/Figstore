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
import model.brand;

/**
 *
 * @author atung
 */
public class BrandDAO extends DBContext {

    public List<brand> getBrand() {
        List<brand> list = new ArrayList<>();
        String sql = " SELECT br.brandId, br.brand, br.originId FROM brand br";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {                
               brand br = new brand();
               br.setBrandId(rs.getInt("brandId"));
               br.setBrand(rs.getString("brand"));
               br.setOriginId(rs.getInt("originId"));
               
               list.add(br);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
}
