package loginmethod;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker1
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnect {

    public static void dbConnect() {
        try {
            Class.forName("com.mysql.jbdc");
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }

        String host = "jdbc:mysql://159.253.7.5";
        String username = "jurmekf94_lgha";
        String password = "wopPcdkJ8";

        try {
            Connection con = DriverManager.getConnection(host, username, password);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }

    }
}
