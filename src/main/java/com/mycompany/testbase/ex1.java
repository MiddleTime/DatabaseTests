package com.mycompany.testbase;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ex1 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, 
            InstantiationException, IllegalAccessException {
        Driver driver = (Driver) Class.forName("com.mysql.jdbc.Driver").newInstance();
        DriverManager.registerDriver(driver);

        StringBuilder url = new StringBuilder();

        url.append("jdbc:mysql://").
                append("localhost:").
                append("3306/").
                append("test?").
                append("root&").
                append("");
        System.out.println(url);
        Connection connection = DriverManager.getConnection(url.toString());
        System.out.println(connection);

    }
}
