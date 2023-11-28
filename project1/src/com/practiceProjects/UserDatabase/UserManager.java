package com.practiceProjects.UserDatabase;
import java.util.*;


public class UserManager {
    public static List<User> userList = new ArrayList<>(); // probably make this private after I get it working
    static String createPassword(Scanner scanner) {
        String password  = "";
        String confirmPassword = "";
        boolean isFirstIteration = true;
        //boolean isFirstIteration1 = true;
        boolean back = false;
        boolean valid = false;
        boolean matches = false;
        while (true) {
            valid = false;
            back = false;
            System.out.println("Enter your password: ");
            while (true) {
                password = scanner.nextLine();
                if (password.matches("^(?=.*[!@#$%^&*()_+{}\\[\\]|'\"<>/,.?~`])(?=.*\\d)(?=.*[A-Z])(?!.*\\s).{9,}$")) {
                    break;
                }
                System.out.println("The password you entered does not meet the complexity requirements.\n" +
                        "\"your password must:\" +\n" +
                        "                    \" - be at least 7 characters\\n\" +\n" +
                        "                    \" - contain at least one capital and one lowercase letter\\n\" +\n" +
                        "                    \" - contain at least one number\\n\" +\n" +
                        "                    \" - contain at least one special character\\n\" +\n" +
                        "                    \" - not contain a space\\n\\n\" +\n" +
                        "                    \"Enter your password: \"");
            }
            while (true) {
                System.out.println("Please confirm your password: ");
                confirmPassword = scanner.nextLine();
                if (confirmPassword.equalsIgnoreCase("b")) {
                    back = true;
                    break;
                }
                if (Objects.equals(password, confirmPassword)) {
                    break;
                }
                System.out.println("The passwords do not match.\n" +
                        "Please enter a matching password, or you can enter \"B\" to go back");
            }
            if (!back) {
                return password;
            }
        }
    }
    public static void createUser(Scanner scanner) {
        while (true) {
            String username = "";
            System.out.println("\nType \"QUIT\" to quit\n\nEnter your username (cannot contain a space): ");
            while (true) {
                username = scanner.nextLine();
                if (username.equalsIgnoreCase("QUIT")) return;
                if (username != null && !username.isEmpty() && !username.contains(" ")) break;
                else System.out.println("Make sure your username doesn't contain a space\nEnter your username: ");
            }
            System.out.println("This output is from UserManager.createUser\nUsername entered: " + username + "\n\n");
            User user = new User(scanner, username);
            userList.add(user);
            while (true) {
                try {
                    System.out.println("Would you like to create another user? (Y / N)");
                    String createAnotherUserString = scanner.nextLine();
                    if (createAnotherUserString.length() == 1 && "YyNn".contains(createAnotherUserString)) {
                        if (createAnotherUserString.equalsIgnoreCase("Y")) {
                            break;
                        } else {
                            return;
                        }
                    } else {
                        System.out.println("There are 2 possible choices.\n");
                    }
                } catch (Exception e) {
                    System.out.println("There are only 2 possible choices.\n" + e.getMessage());
                }
            }
        }
    }
}
