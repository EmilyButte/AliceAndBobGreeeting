package butte.emily.AliceAndBobGreeting;

import java.util.Scanner;

// Write a program that asks the user for his/her name, and
// only the users Alice and Bob are greeted with their names.

public class AliceAndBobGreeting {

    String userName;

    public void userName() {
        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
    }

    public void loop() {
        if (userName.equals("Bob") || (userName.equals("Alice"))) {
            System.out.println("Hello, " + userName + "!");
        } else {
            System.out.println("Hello there!");
        }
    }

    public static void main(String[] args) {
        AliceAndBobGreeting greeting = new AliceAndBobGreeting();
        greeting.userName();
        greeting.loop();
    }
}

