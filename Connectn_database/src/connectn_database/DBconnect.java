
package connectn_database;

import java.sql.*;

public class DBconnect {
    private Connection con;
    private Statement st;
    private ResultSet rs;
    public DBconnect(){
try{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/agriculture","root","@amimehedi");
st = con.createStatement();
}  catch(Exception ex)
{
    System.out.println("Erro:"+ex);
}
}
  public void getData()
  {
      try{
      String query="select* from mehedi";
      rs= st.executeQuery(query);
          System.out.println("Records from Database");
          while(rs.next()){
          String name=rs.getString("name");
          String age=rs.getString("age");
          //String Solution_In_Detail=rs.getString("Solution_In_Detail");
              System.out.println("Problem_Name:"+name);
              System.out.println("Problem_And_Cause_Of_Diseases:"+age);
            //  System.out.println("Solution_In_Detail:"+Solution_In_Detail);
          
          }
      }catch(Exception ex)
      {
          System.out.println("ex");
      }
  }
}
