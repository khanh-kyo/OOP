/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP.jdbcConnect;

import java.sql.*;

/**
 * /**
 *
 * @author KhanhKyo
 */
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        
        DatabaseConnect dc = new DatabaseConnect("localhost", "demo", "root", "");

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {

            connection = dc.getConnection();

            statement = connection.createStatement();

            String sql = "SELECT * FROM employees";

            resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                System.out.println(resultSet.getString("first_name"));
            }

        } catch (SQLException e) {
            System.out.print("aa");
        } finally {
            // close connections,...
//            close(connection , statement, resultSet);
        }

    }

    private static void close(Connection connection, Statement statement, ResultSet resultSet) throws SQLException {

        try {
            if (resultSet != null) {
                resultSet.close();
            }
            
            if (statement != null) {
                statement.close();
            }
            
            if (connection != null) {
                connection.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}
