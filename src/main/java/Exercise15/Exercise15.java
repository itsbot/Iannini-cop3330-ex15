/*
 *  UCF COP3330 Fall 2021 Exercise 15 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise15;
import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = sc.next();
        System.out.print("Enter a password: ");
        String password = sc.next();

        if (username.equals("user1")&& password.equals("Abc123!")) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}
