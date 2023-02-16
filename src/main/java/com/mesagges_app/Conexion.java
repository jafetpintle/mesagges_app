package com.mesagges_app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection get_connection(){
        Connection connection = null;

        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "toor");
            if(connection !=null){
                System.out.printf("Connection succesfull");
            }
        }catch(SQLException e){
            System.out.printf("Connection failed");
        }
        return connection;
    }
}
