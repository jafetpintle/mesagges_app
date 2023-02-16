package com.mesagges_app;

import java.sql.Connection;
import java.util.Scanner;

public class Main {

    static String mainMenuMessage = ("=================== \n"
            + "\n Tiny social media \n"
            + "1. Sign up \n"
            + "2. Log in \n"
            + "3. Exit \n");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mainMenu(sc);
        sc.close();
    }

    public static void mainMenu(Scanner sc){

        int option = 0;

        //First Menu
        do{
            System.out.println(mainMenuMessage);
            //Read user input
            option = sc.nextInt();

            switch (option){
                case 1:
                    break;
                case 2:
                    MenuSession.menuSession(sc);
                    break;
                default:
                    break;
            }
        }while(option != 3);
    }
}
