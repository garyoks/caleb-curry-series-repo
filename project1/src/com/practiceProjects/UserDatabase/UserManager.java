package com.practiceProjects.UserDatabase;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class UserManager {

    public static HashMap<Integer, User> userIds = new HashMap<>();
    private static void userFactory (Scanner scanner, String username, int userId) {
        User newUser = new User(scanner, userId, username);
        userIds.put(userId, newUser);
    }
    public static User userFactoryAccessor(Scanner scanner, Integer userId, String username) {
        UserManager.userFactory(scanner, username, userId);
        return userIds.get(userId);
    }
}
