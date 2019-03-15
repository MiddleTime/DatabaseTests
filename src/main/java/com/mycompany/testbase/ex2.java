
package com.mycompany.testbase;

import java.sql.*;


public class ex2 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM tasks");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(2)); //выведем данные по второй колонке
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
