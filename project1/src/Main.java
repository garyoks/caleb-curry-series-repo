import com.practiceProjects.UserDatabase.User;
import com.practiceProjects.UserDatabase.UserManager;

import static com.practiceProjects.UserDatabase.UserManager.userList;

import java.util.Scanner;
public class Main {
    public static String[] programs = {"User Database",
            "whatever the next thing is...",
            "Console Chess"};
    public static void main(String[] args) {
        Main.chooseProgram();

        if (!userList.isEmpty()) {
            //Testing that users are, in fact, created
            System.out.println("\nAll User Details:");
            for (User user : userList) {
                String username = user.getUsername();
                String password = user.getPassword();
                System.out.println("Username: " + username + "\nPassword: " + password);
                System.out.println();
            }
        }
    } //calls chooseProgram()
    private static void chooseProgram() {
        System.out.println("\n\nHere's some of the practice problems/projects I've been working on:\n");
        Scanner scanner = new Scanner(System.in);
        boolean isFirstIteration = true;
        while (true) {
            isFirstIteration = true;
            while (true) {
                try {
                    if (isFirstIteration) {
                        System.out.println("Enter the number of the program you want to run, or press Q to quit");
                    } else {
                        System.out.println("Enter a number on the list please, or press Q to quit:");
                    }
                    for (int i = 0; i < programs.length; i++) {
                        System.out.println((i + 1) + " - " + programs[i]);
                    }
                    String userChoiceString = scanner.nextLine();
                    if (userChoiceString.equalsIgnoreCase("Q")) {
                        scanner.close();
                        return;
                    }
                    int userChoiceInt = Integer.parseInt(userChoiceString);
                    switch (userChoiceInt) {
                        case 1:
                            UserManager.createUser(scanner);
                            break;
                        case 2:
                            System.out.println("A work in progress...");
                            break;
                        case 3:
                            System.out.println("This one will be a console chess game...");
                            break;
                    }
                    if (userChoiceInt < 3) break;
                } catch (Exception e) {
                    System.out.println("Error:" + e.getMessage());
                }
                isFirstIteration = false;
            }
            while (true) {
                try {
                    System.out.println("Would you like to run another program? (Y / N)");
                    String againString = scanner.nextLine();
                    if (againString.length() == 1 && "YyNn".contains(againString)) {
                        if (againString.equalsIgnoreCase("Y")) {
                            break;
                        } else {
                            scanner.close();
                            return;
                        }
                    } else {
                        System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                    }
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }
            }
        }
    }
}