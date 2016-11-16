/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuggageHeroV05.Methods;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Jurmen Hughes
 */
public class dbClose {

    public static void dbClose( ResultSet resultset,
                                Statement statement,
                                Connection con ) {

        //Database Connectie sluiten
        try {
            resultset.close();
            statement.close();
            con.close();
        } //-----
        
        //Error handling
        catch (Exception ex) {
            System.out.println("Error: " + ex);

        }
        //------
    }
}
