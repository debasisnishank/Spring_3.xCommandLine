package com.db;
import java.sql.*;
import javax.sql.*;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class EmployeeDaoImp {
    public DataSourceObject ds;
     @Autowired
    public EmployeeDaoImp(DataSourceObject ds1) {
        ds = ds1;
    }

    private Connection getCon() throws Exception {
        Connection con = ds.db.getConnection();
        return con;
    }

    // insertion
    public int insertRecord(int id, String name) {
        Connection con = null;
        int result = 0;
        try {
            System.out.println("Enter into insertRecord...");
            con = getCon();
            System.out.println("get connection...");
            PreparedStatement ps = con.prepareStatement("insert into emp values(?,?)");
            ps.setInt(1, id);
            ps.setString(2, name);
            result = ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {

            }
        }
        return result;
    }

    // deletion
    public int deleteRecord(int id) {
        Connection con = null;
        int rowsAffected = 0;

        try {

            con = getCon();
            System.out.println("got connection...");
            PreparedStatement ps = con.prepareStatement(" delete from emp where empid = ?");
            ps.setInt(1, id);
            rowsAffected = ps.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException e) {

            }
        }
        return rowsAffected;
    }

    // view records
    public void showRecord() {
        String query = "select * from emp";
        Connection con = null;
        ResultSet rs = null;
        Statement st = null;
        try {
            con = getCon();
            st = con.createStatement();
            rs = st.executeQuery(query);
            while (rs.next()) {
                Integer empId = rs.getInt(1);
                String empName = rs.getString(2);

                System.out.println("empId:" + empId);
                System.out.println("firstName:" + empName);

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // update record
    public int updateEmployeeDetails(int id, String name) {
        Connection con = null;
        String sql = "UPDATE emp SET empname = ? WHERE empid = ?";
        int  affectedRows = 0;
        try {
            con = getCon();
            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setString(1, name);
           pstmt.setInt(2,id);
             affectedRows = pstmt.executeUpdate();
       
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        return affectedRows;
    }
   

}
