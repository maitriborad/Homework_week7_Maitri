package homework;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class P12Input {
    public static void main(String[] args) {
        check();
    }
    static char input;
    public static void check(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your input: ");
        input = scan.next().charAt(0);
        // CHECKING FOR ALPHABET
        if ((input >= 65 && input <= 90)
                || (input >= 97 && input <= 122)) {
            System.out.println(" Alphabet ");
        }
            // CHECKING FOR DIGITS
        else if (input >= 48 && input <= 57) {
            System.out.println(" Digit ");
        }
            // OTHERWISE SPECIAL CHARACTER
        else {
            System.out.println(" Special Character ");
        }
        scan.close();
    }
}
