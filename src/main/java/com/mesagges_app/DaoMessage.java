package com.mesagges_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
                System.out.println("Message was created succesfull!");
            }catch(SQLException ex){
                System.out.println("Error creating message\n"+ex);
            }
            connection.close();
        }catch(SQLException e){
            System.out.println("Error connection to DB\n"+e);
        }
    }

    public static void readMessage(){
        try(Connection connection = con.getConnection()){
            PreparedStatement ps = null;
            ResultSet rs = null;
            try{
                String query = "SELECT * FROM mensajes_app.messages";
                ps = connection.prepareStatement(query);
                rs = ps.executeQuery();

                while(rs.next()){
                    System.out.println("ID: "+rs.getInt("id_message"));
                    System.out.println("Message: "+rs.getString("message"));
                    System.out.println("Author: "+rs.getString("message_author"));
                    System.out.println("Date"+rs.getString("message_date"));
                    System.out.println("----------------------------------------------------------");
                }
            }catch(SQLException ex){
                System.out.println("Error creating message\n"+ex);
            }
        }catch(SQLException e){
            System.out.println("Error connection to DB\n"+e);
        }
    }


    public static void deleteMessage(int id_message){

    }

    public static void updateMessage(Message message){

    }

    public static void closeConecttion() throws SQLException {
        con.closeConnnection();
    }
}
