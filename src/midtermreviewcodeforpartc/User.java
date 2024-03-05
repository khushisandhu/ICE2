/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermreviewcodeforpartc;

/**
 * A class that models a User for Uno Online.
 * The user has a name and a password.
 * @author dancye, 2019
 */

public class PasswordValidator {
    public static boolean validatePassword(String password) {
        // Password must have at least 8 characters
        if (password.length() < 8) {
            return false;
        }

        // Password must contain at least one special character
        boolean containsSpecialChar = false;
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                containsSpecialChar = true;
                break;
            }
        }

        return containsSpecialChar;
    }
}

public class User 
{
    private String name;
    private String password;
    
    /**
     * a constructor that takes in the user's name and password
     * @param givenName
     * @param givenPass 
     */
    public User(String givenName, String givenPass)
    {
        name = givenName;
        password=givenPass;
    }

    /** The getter for the user name
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * The setter for the user name
     * @param givenName the name to set
     */
    public void setName(String givenName) {
        name = givenName;
    }

    /**
     * The getter for the password
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * A setter for the password
     * @param givenPass 
     */
    public void setPassword(String givenPass)
    {
        password = givenPass;
    }
    
}
