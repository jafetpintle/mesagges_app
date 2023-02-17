package com.mesagges_app;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

import java.sql.SQLException;
import java.util.Scanner;

public class ServiceMessage {
    public static void createMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Write your message");
        String messageContent = sc.nextLine();

        System.out.println("Write your name");
        String messageName = sc.nextLine();

        Message ms = new Message();
        ms.setContent(messageContent);
        ms.setAuthor(messageName);

        DaoMessage.createMessage(ms);
    }

    public static void listMessages(){
        DaoMessage.readMessage();
    }

    public static void deleteMessage(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the ID message to delete: ");
        int id_message = sc.nextInt();
        DaoMessage.deleteMessage(id_message);
    }

    public static void editMessage(){
        Message ms = new Message();
        Scanner sc = new Scanner(System.in);
    }

}
