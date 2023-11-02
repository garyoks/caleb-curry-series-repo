package com.practiceProjects.UserDatabase;

public class PasswordStrengthChecker {
    private boolean isValidPassword = false;
    private String password = null;
    public static boolean hasLength(String password) {
        boolean hasLength = false;
        if (password.length() >= 7) {
            hasLength = true;
        }
        return hasLength;
    }
    public static boolean hasNumber(String password) {
        boolean hasNumber = false;
        try {
            int integer = Integer.parseInt(password);
            hasNumber = true;
        } catch (Exception e) {
            System.out.println("Password must contain at least one number");
        }

        return hasNumber;
    }
    public static boolean hasLetter(String password) {
        boolean hasLetter = false;
        for (int i = 0; i < password.length(); i++) {
            char tempChar = password.charAt(i);
            int ascii = (int) tempChar;
            System.out.println("ascii: " + ascii);
        }
        return hasLetter;
    }
    public static boolean hasSpecial(String password) {
        boolean hasSpecial = false;

        return hasSpecial;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        if (isValidPassword) {
            return password;
        } else {
            return "";
        }
    }
}
