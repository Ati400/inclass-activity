/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 17133
 */

public class PasswordValidator {

    public boolean isValid(String password) {
        if (password.length() >= 8 &&
            !password.equals(password.toLowerCase()) &&
            password.matches(".*[0-9].*") &&
            password.matches(".*[^a-zA-Z0-9].*")) {
            return true;
        }
        return false;
    }
}
