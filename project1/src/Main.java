// I'm skipping ahead quite a bit bc I already know everything he covered in the first
// 31 videos. Starting here working with arrays.
// never-mind. I'm going to make a password validator & generator
// and probably much more stuff
import com.practiceProjects.UserDatabase.User;

import java.util.Scanner;
public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static String userChoiceString = "";
    public static int userChoiceInt = 0;
    public static boolean isFirstIteration = true;
    public static String[] programs = {"User Database",
            "whatever the next thing is...",
            "Console Chess"};
    public static String againString = "";
    public static void main(String[] args) {
        System.out.println("\n\nHi how are you?\nWonderful weather we're having\nHere's some of the practice problems/projects I've been working on:\n");
        Main.chooseProgram();
        scanner.close();
    } //calls chooseProgram()
    private static void chooseProgram() {
        while (true) {
            isFirstIteration = true;
            while (true) {
                try {
                    if (isFirstIteration) {
                        System.out.println("Enter the number associated with the program you want to run, or press Q to quit");
                    } else {
                        System.out.println("Enter a number on the list please, or press Q to quit:");
                    }
                    for (int i = 0; i < programs.length; i++) {
                        System.out.println((i + 1) + " - " + programs[i]);
                    }
                    userChoiceString = scanner.nextLine();
                    if (userChoiceString.equalsIgnoreCase("Q")) {
                        return;
                    }
                    userChoiceInt = Integer.parseInt(userChoiceString);
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
                    if (userChoiceInt > 3) {
                        System.out.println("Haven't done that one yet");
                    }  // prolly delete later.,/
                    break;
                } catch (Exception e) {
                    System.out.println("Error:" + e.getMessage());
                }
                isFirstIteration = false;
            }
            while (true) {
                try {
                    //scanner.nextLine();
                    System.out.println("Would you like to run another program? (Y / N)");
                    againString = scanner.nextLine();
                    if (againString.length() == 1 && "YyNn".contains(againString)) {
                        if (againString.equalsIgnoreCase("Y")) {
                            break;
                            //Main.chooseProgram();
                        } else {
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