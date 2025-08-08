package JDBC;

import java.sql.*;

public class FirstJdbc {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String sql;

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lith","root","lithesh@2004");

        Statement smt = con.createStatement();

        sql = "insert into student values(101,'pavan','Karkala','general')";
        int result = smt.executeUpdate(sql);
        if (result > 0) {
            System.out.println("Student details added sucessfully");
        } else {
            System.out.println("Student details not added");
        }

    }

}
