import com.practiceProjects.UserDatabase.User;
import java.util.Scanner;
//just testing hashmap
import com.practiceProjects.UserDatabase.UserManager;

public class Main {
    //public static Scanner scanner = new Scanner(System.in);
    //public static String userChoiceString = "";
    //public static int userChoiceInt = 0;
    //public static boolean isFirstIteration = true;
    public static String[] programs = {"User Database",
            "whatever the next thing is...",
            "Console Chess"};
    //public static String againString = "";
    public static void main(String[] args) {
        Main.chooseProgram();

        //just testing hashmap
        System.out.println(UserManager.userIds);
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
                            User.createUser(scanner);
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