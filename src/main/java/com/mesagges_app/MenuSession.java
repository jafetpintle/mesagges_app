package com.mesagges_app;

import java.util.Scanner;
public class MenuSession {
    public static void menuSession(Scanner sc){
        int option = 0;
        String sessionMenuMessage = ("=================== \n"
                + "1. Write message \n"
                + "2. Read message \n"
                + "3. Delete Message \n"
                + "4. Edit profile \n"
                + "5. Your profile \n"
                + "6. Logout \n");

        //menu when session starts
        do{
            System.out.println(sessionMenuMessage);
            //Read user input
            option = sc.nextInt();

            switch (option){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    break;
            }
        }while(option != 6);
    }
}
