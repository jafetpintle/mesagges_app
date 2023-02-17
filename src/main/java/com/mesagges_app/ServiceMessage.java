package com.mesagges_app;

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

    }

    public static void deleteMessage(){

    }

    public static void editMessage(){

    }
}
