package LuggageHeroV05.Methods;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jurmen Hughes
 */
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Gebruiker1
 */
public class dbConnect {

    /**
     *
     * @return
     */
    public static Connection dbConnect() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String host = "jdbc:mysql://159.253.7.5/jurmekf94_lgh";
            String username = "jurmekf94_lgha";
            String dbpassword = "wopPcdkJ8";
            con = DriverManager.getConnection(host, username, dbpassword);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);

        }

        return con;
    }
}
