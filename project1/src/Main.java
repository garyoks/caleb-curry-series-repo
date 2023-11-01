// I'm skipping ahead quite a bit bc I already know everything he covered in the first
// 31 videos. Starting here working with arrays.
// never-mind. I'm going to make a password validator & generator
// and probably much more stuff
import com.practiceProjects.User;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("hi here's some of the practice problems/projects I've been working on:\n");
        Main.chooseProgram();
    }
    private static void chooseProgram() {
        System.out.println("Here's a list of the functionality I have built so far in this practice clusterfuck.\n" +
                "Press the number associated with the program you want to run, or press Q to quit");
        Scanner scanner = new Scanner(System.in);
//        String userChoice = chooserScanner.next();
        int userChoiceInt = 0;
        boolean isFirstIteration = true;
        while (true) {
            try {
                if (!isFirstIteration) {
                    System.out.println("Enter a number on the list please:");
                }
                userChoiceInt = scanner.nextInt();
                /*switch (userChoiceInt) {
                    case 1:
                        //User.createUser();
                        break;
                }*/
                if (userChoiceInt == 1) {
                    //User.createUser();
                    System.out.println("**call method here**");
                }
                else {
                    System.out.println("Haven't done that one yet");
                }
                break;
            } catch (Exception e) {
                System.out.println("Error:" + e.getMessage());
            }
        isFirstIteration = false;
        }
        //chooserScanner.close();

        //Scanner againScanner = new Scanner(System.in);
        //System.out.println("Would you like to run another program? (Y / N)");
        //String againString = null;
        //while (true) {
/*            try {
                System.out.println("Would you like to run another program? (Y / N)");
                Scanner againScanner = new Scanner(System.in);
                //againScanner.next();
                String againString = againScanner.next();
                //againScanner.close();

                if (againString.charAt(0) == 'Y' || againString.charAt(0) == 'y' || againString.charAt(0) == 'N' || againString.charAt(0) == 'n') {
                    if (againString.charAt(0) == 'Y' || againString.charAt(0) == 'y') {
                        againScanner.close();
                        Main.chooseProgram();
                    } else {
                        againScanner.close();
                        return;
                    }
                }
                //break;
            } catch (Exception e) {
                System.out.println("follow directions. thx\n" + e.getMessage());
            }*/

        // chatGPT's method:

        String againString;
        while (true) {
            try {

                //Scanner againScanner = new Scanner(System.in);
                //againScanner.nextLine();
                System.out.println("Would you like to run another program? (Y / N)");
                //againString = againScanner.next();
                againString = scanner.next();

                if (againString.length() == 1 && "YyNn".contains(againString)) {
                    if (againString.equalsIgnoreCase("Y")) {
                        //againScanner.close();
                        Main.chooseProgram();
                    } else {
                        //againScanner.close();
                        return;
                    }
                } else {
                    System.out.println("Invalid input. Please enter 'Y' or 'N'.");
                }
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
        //}
        //againScanner.close();
    }
}