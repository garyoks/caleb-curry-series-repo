package com.practiceProjects.UserDatabase;
import java.util.Scanner;
import java.util.ArrayList;
import com.practiceProjects.UserDatabase.UserManager;
public class User {
    private static int tempUserId;
    private static String tempUsername;
    private static String createAnotherUserString;
    private String userName;
    private String password;
    private int[] dateOfBirth = new int[3];
    private static ArrayList<Integer> userIdList = new ArrayList<Integer>();
    //getters:

    //setters:

    public User(Scanner scanner, Integer userId, String username) {
        userName = username;
        System.out.println("username: " + username);
        System.out.println("Enter your password. It must:" +
                "\n                             - be at least 7 characters long" +
                "\n                             - have at least one capital letter" +
                "\n                             - have at least one number" +
                "\n                             - have at least one special character" +
                "\n                             - not contain any spaces");
    }
/*    public static User constructorCaller (Scanner scanner, int userId, String username) {
        return new User(scanner, userId, username);
    }*/





    public static void createUser(Scanner scanner) {
        if (userIdList.isEmpty()) userIdList.add(0);
        int tempUserId = userIdList.get((userIdList.size() - 1));
        while (true) {
            tempUsername = "";
            System.out.println("Type \"QUIT\" if you want to quit\n\nEnter your username (cannot contain a space): ");
            while (true) {
                tempUsername = scanner.nextLine();
                if (tempUsername.equalsIgnoreCase("QUIT")) return;
                if (tempUsername != null && !tempUsername.isEmpty() && !tempUsername.contains(" ")) break;
                else System.out.println("Make sure your username doesn't contain a space\nEnter your username: ");
            }
            System.out.println("Username entered: " + tempUsername + "\nThis is as far as I've gotten\n\n" +
                    "**call constructor with a single username parameter\n\n");

            //put all logic for filling out User fields into the UserManager class
            System.out.println(UserManager.userFactoryAccessor(scanner, tempUserId, tempUsername));





            while (true) {
                try {
                    System.out.println("Would you like to create another user? (Y / N)");
                    createAnotherUserString = scanner.nextLine();
                    if (createAnotherUserString.length() == 1 && "YyNn".contains(createAnotherUserString)) {
                        if (createAnotherUserString.equalsIgnoreCase("Y")) {
                            break;
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
        }
    }
}
