
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author OMNAIK
 */
public class DatabaseConnection {
    Connection conn = null;
    public static Connection dbConnector(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:sqlite:D:\\\\Netbeans\\\\Projects\\\\JavaDBMSApp\\\\src\\\\database\\\\JavaProjectDB.db", "omnaikuser", "omnaikpassword");
            JOptionPane.showMessageDialog(null, "Connection Successful");
            return conn;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
