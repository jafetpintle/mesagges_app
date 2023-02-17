package com.mesagges_app;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static Connection connection;
    private static Conexion instance;

    public Connection getConnection(){

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

    public void closeConnnection() throws SQLException{
        try{
            connection.close();
        }catch(Exception e){
            connection.close();
        }
    }

    public static Conexion getInstance(){
        if(instance == null){
            instance = new Conexion();
        }
        return instance;
    }


}
