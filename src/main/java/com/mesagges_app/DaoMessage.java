package com.mesagges_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoMessage {
    static Conexion con = Conexion.getInstance();

    public static void createMessage(Message message){
        try(Connection connection = con.getConnection()){
            PreparedStatement ps = null;
            try{
                String query="INSERT INTO `mensajes_app`.`messages` (`message`, `message_author`) VALUES (?,?)";
                ps = connection.prepareStatement(query);
                ps.setString(1,message.getContent());
                ps.setString(2,message.getAuthor());
                ps.executeUpdate();
                System.out.printf("Message was created succesfull!");
            }catch(SQLException ex){
                System.out.printf("Error creating message\n"+ex);
            }
        }catch(SQLException e){
            System.out.println("Error connection to DB\n"+e);
        }
    }

    public static void readMessage(){

    }

    public static void deleteMessage(int id_message){

    }

    public static void updateMessage(Message message){

    }
}
