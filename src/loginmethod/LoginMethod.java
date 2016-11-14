/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginmethod;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Jurmen
 */
public class LoginMethod {

    public static User Login(String email, String password) {
        Connection con = dbConnect.dbConnect();
        try {
            Statement statement = con.createStatement();
            String query = "SELECT * FROM users WHERE email" + email;
            ResultSet resultaat = statement.executeQuery(query);
        } catch (Exception ex) {
            System.out.println("Error: " + ex);

        }

        User user = new User();
        if (password.equals(result.getString(password))) {
            while (result.next()) {
                user.aid = result.getInt("uid");
                user.firstName = resultaat.getString("firstName");
                user.lastName = resultaat.getString("lastName");
                user.function = resultaat.getString("function");
                user.email = resultaat.getString("email");
                user.telephone = resultaat.getString("telephone");
                user.employeeNumber = resultaat.getString("employeenumber");
                user.birthdate = resultaat.getDate("birthdate");

                return user;
            }
        } else {
            System.out.println("WACHTWOORD ONJUIST BERICHT");
        }
