package com.practiceProjects.UserDatabase;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {
    public static String tempUsername;
    public static String createAnotherUserString;
    //public static boolean iReallyShouldntHaveToDoThisButLetsSeeIfItFixesTheBug = true;
    //basically a check of whether or not the user wants to continue^^
    private String userName;
    private String password;
    private int[] dateOfBirth = new int[3];
    private boolean isValidPassword = false;

//constructors:
    /*public void User(){
        userName = "New";
        password = "";
        for (int i = 0; i < 3; i++) {
            dateOfBirth[i] = 0;
        }
    }*/
/*    private void User(String userName) {
        this.userName = userName;
        System.out.println("username: " + userName);
        System.out.println("Enter your password. It must:" +
                "\n                             - be at least 7 characters long" +
                "\n                             - have at least one capital letter" +
                "\n                             - have at least one number" +
                "\n                             - have at least one special character" +
                "\n                             - not contain any spaces");
    }*/
    public static void createUser(Scanner scanner) {
        //iReallyShouldntHaveToDoThisButLetsSeeIfItFixesTheBug = true;
        while (true) {
            tempUsername = "";
            //Scanner userScanner = new Scanner(System.in);
            System.out.println("Type \"QUIT\" if you want to quit\n\nEnter your username (cannot contain a space): ");
            while (true) {
                tempUsername = scanner.nextLine();
                if (tempUsername.equalsIgnoreCase("QUIT")) {

                    //iReallyShouldntHaveToDoThisButLetsSeeIfItFixesTheBug = false;
                    return;
                }
                if (tempUsername != null && !tempUsername.isEmpty() && !tempUsername.contains(" ")) {
                    break;
                } else {
                    System.out.println("Make sure your username doesn't contain a space\nEnter your username: ");
                }
            }
            System.out.println("Username entered: " + tempUsername + "\nThis is as far as I've gotten\n\n" +
                    "**call constructor with a single username parameter\n\n");
        /*Map<String, User> objectMap = new HashMap<>();
        User newObject = new User();
        objectMap.put(tempUsername, newObject);
*/
            //if (iReallyShouldntHaveToDoThisButLetsSeeIfItFixesTheBug) {
                while (true) {
                    try {
                        System.out.println("Would you like to create another user? (Y / N)");
                        createAnotherUserString = scanner.nextLine();
                        if (createAnotherUserString.length() == 1 && "YyNn".contains(createAnotherUserString)) {
                            if (createAnotherUserString.equalsIgnoreCase("Y")) {
                                break;
                                //User.createUser(scanner);  //recursion
                            } else {
                                return;
                            }
                        } else {
                            System.out.println("follow directions. there are 2 choices. thx\n");
                        }
                    } catch (Exception e) {
                        System.out.println("follow directions. thx\n" + e.getMessage());
                    }
                }
            //}
        }
    }


//    public void User(String userName) {
//        if (userName isAvailable) {
//            this.userName=userName;
//        }
//    }
}
