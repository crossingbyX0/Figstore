/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author atung
 */
import dal.ProductDAO;
import java.util.List;
import model.Product;

public class test {
    public static void main(String[] args) {
       ProductDAO db = new ProductDAO();
       List<Product> list = db.getAllProductCRUD();
       for (Product p : list) {
            System.out.println(p); 
        }
    }
}
