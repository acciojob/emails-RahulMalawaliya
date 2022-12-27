package com.driver;


public class Email {

    private String emailId;
    private String password;

    public Email(String emailId){
        this.emailId = emailId;
        this.password = "Accio@123";
    }

    public String getEmailId() {
        return this.emailId;
    }

    public String getPassword() {

        return this.password;
    }

    public void changePassword(String oldPassword, String newPassword){
        //Change password only if the oldPassword is equal to current password and the new password meets all of the following:
        // 1. It contains at least 8 characters
        // 2. It contains at least one uppercase letter
        // 3. It contains at least one lowercase letter
        // 4. It contains at least one digit
        // 5. It contains at least one special character. Any character apart from alphabets and digits is a special character
        if(oldPassword.equals(this.password)) {

            if(isValid(newPassword))
            {
                System.out.println("succesfully changed");
            }
            else
            {
                System.out.println("please write valid password");
                return;
            }

        }
        else return;
    }
    public static boolean isValid(String s) {
        // Initialize variables to track the presence of the required characters
        boolean hasLower = false;
        boolean hasUpper = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // Check if the string has the required characters and set the variables accordingly
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '+' || c == '=') {
                hasSpecial = true;
            }
        }
        return hasLower && hasUpper && hasDigit && hasSpecial && s.length() >= 8;
    }
}
