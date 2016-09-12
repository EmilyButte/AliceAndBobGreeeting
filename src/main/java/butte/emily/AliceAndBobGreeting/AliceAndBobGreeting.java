package butte.emily.AliceAndBobGreeting;
// Write a program that asks the user for his/her name and only the users Alice and Bob are greeted with their names.
import java.util.Scanner;

public class AliceAndBobGreeting {
    String userName;

    public void userName() {
        //create scanner object to ask user for name
        System.out.println("What is your name? ");
        Scanner myScanner = new Scanner(System.in);
        userName = myScanner.nextLine();
    }

    public void loop() {
        // use if statement to check if user name is Bob or Alice
        if ((userName.equals("Bob")) || (userName.equals("Alice"))) {
            System.out.println("Hello " + userName);
        // if not print just hello
        } else {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        AliceAndBobGreeting aliceAndBobGreeting = new AliceAndBobGreeting();
        aliceAndBobGreeting.userName();
        aliceAndBobGreeting.loop();
    }
}
