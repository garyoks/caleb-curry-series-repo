package com.practiceProjects.UserDatabase;
import java.util.Scanner;
import java.util.ArrayList;
import com.practiceProjects.UserDatabase.UserManager;

import static com.practiceProjects.UserDatabase.UserManager.userList;

public class User {
    //private static int userId;
    private String userName;
    private String password;

    //private int[] dateOfBirth = new int[3];
    //private static ArrayList<Integer> userIdList = new ArrayList<Integer>();


    //security questions:

    private String securityQ1 = "";
    private String securityQ2 = "";
    private String securityQ3 = "";


    //getters:

    public String getUsername() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public void forgotPassword(Scanner scanner, String username) {
        boolean hasMatch = false;
        for (User user: userList) {
            String userName = user.getUsername();
            if(userName == username) {
                hasMatch = true;
            }
            // security questions logic:
            if (hasMatch) {
                System.out.println("Password: " + user.password);
            }
        }
        if (!hasMatch) {
            System.out.println("The username you entered does not exist.\n");
        }
    }
    //setters:
    public User(Scanner scanner, String username) {
        userName = username;
        System.out.println("(This output is from the User.User constructor:\nusername: " + username);

        password = UserManager.createPassword(scanner);
    }
    /*    public static User constructorCaller (Scanner scanner, int userId, String username) {
        return new User(scanner, userId, username);
    }*/
}
