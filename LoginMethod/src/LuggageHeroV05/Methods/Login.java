/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuggageHeroV05.Methods;

import static LuggageHeroV05.Methods.dbConnect.*;
import static LuggageHeroV05.Methods.dbClose.*;
import LuggageHeroV05.Classes.User;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Jurmen Hughes
 */
public class Login {

    public static void Login(User user, String email, String password) {
        //Connect to the database
        Connection con = dbConnect();
        //------

        //Getting Data from the Users table in the database
        try {
            String query = "SELECT * FROM users WHERE email = '" + email + "'";
            Statement statement = con.createStatement();
            ResultSet resultaat = statement.executeQuery(query);
            //------

            //Checking if the passwords match. if it does, place data in User object
            if (resultaat.next()) {
                if (password.equals(resultaat.getString("password"))) {
                    user.aid = resultaat.getInt("uid");
                    user.firstName = resultaat.getString("firstName");
                    user.lastName = resultaat.getString("lastName");
                    user.function = resultaat.getString("function");
                    user.email = resultaat.getString("email");
                    user.telephone = resultaat.getString("telephone");
                    user.employeeNumber = resultaat.getString("employeenumber");
                    user.birthdate = resultaat.getDate("birthdate");

                }

            }
            //------

            //Close Database Connection
            dbClose(resultaat, statement, con);
            //-----

        //Error handling
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        //------
    }
}
