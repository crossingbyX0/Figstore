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

/**
 *
 * @author atung
 */
public class OriginDAO extends DBContext {

    public List<Origin> getOrigin() {
        List<Origin> list = new ArrayList<>();
        String sql = " SELECT * FROM Origin o";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                Origin o = new Origin();
                o.setId(rs.getInt("id"));
                o.setName(rs.getString("name"));
                list.add(o);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
}
