import java.sql.*;
import javax.sql.*;
public class EmployeeDaoImp {
    private DataSource ds=null;
    public EmployeeDaoImp(DataSource ds1)
         {
              ds=ds1;
         }
     private Connection getCon()throws Exception
        {
            Connection con=ds.getConnection();
            return con;
        }
     public int insertRecord(int id,String name)
        {
              Connection con=null;
                int result=0;
             try{
            	        System.out.println("Enter into insertRecord...");
            	        con=getCon();
            	        System.out.println("get connection...");
                        PreparedStatement ps=con.prepareStatement("insert into emp values(?,?)");
                        ps.setInt(1,id);
                        ps.setString(2,name);
                        result=ps.executeUpdate();
                 }
                catch(Exception e)
                    {
                         System.out.println(e.getMessage());
                     }
                 finally{
                                try{
                                          con.close();
                                    }
                                catch(SQLException e)
                                      {

                                       }
                          }
                    return result;
          }	
}
