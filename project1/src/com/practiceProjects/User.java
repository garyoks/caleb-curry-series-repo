package com.practiceProjects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class User {
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
    public static void createUser() {
        String username = "";
        Boolean containsSpace = true;
        System.out.println("Enter your username (cannot contain a space): ");
        while (containsSpace) {
            Scanner usernameScanner = new Scanner(System.in);
            String tempUsername = usernameScanner.next();
            usernameScanner.close();
            if (!containsSpace) {
                username = tempUsername;
                break;
            } else {
                System.out.println("Make sure your username doesn't contain a space\nEnter your username: ");
            }
        }
        Map<String, User> objectMap = new HashMap<>();
        User newObject = new User();
        objectMap.put(username, newObject);

        System.out.println("Username entered: " + username + "\nThis is as far as I've gotten");


        Scanner anotherUser = new Scanner(System.in);
        System.out.println("Create another user?");
        while (true) {
            try {
                //if ()
                //Scanner anotherUser = new Scanner(System.in);
                String againString = anotherUser.next();
                if (againString.charAt(0) == 'Y' || againString.charAt(0) == 'y' || againString.charAt(0) == 'N' || againString.charAt(0) == 'n') {
                    if (againString.charAt(0) == 'Y' || againString.charAt(0) == 'y') {
                        //anotherUser.close();
                        //User.createUser();
                    }
                }
                //anotherUser.close();
                break;
            } catch (Exception e) {
                System.out.println("follow directions. thx\n" + e.getMessage());
            }
        }
        anotherUser.close();
    }


//    public void User(String userName) {
//        if (userName isAvailable) {
//            this.userName=userName;
//        }
//    }
}
