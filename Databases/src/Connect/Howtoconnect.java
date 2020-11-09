/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Mahmud Mehedi
 */
public class Howtoconnect {
      public Connection con;
     public Statement stat;
     public ResultSet res;
     
      public Howtoconnect()
    {
        systemConnection();
    }
      public void systemConnection()
    {
        try{
Class.forName("com.mysql.jdbc.Driver");
con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/agriculture?zeroDateTimeBehavior=convertToNull","root","@amimehedi");
stat = (Statement)con.createStatement();
JOptionPane.showMessageDialog(null, "cool");
}  catch(Exception e)
{
    JOptionPane.showMessageDialog(null, "cool");
}
    }
}
