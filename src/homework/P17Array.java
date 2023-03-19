package homework;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a Java program to sort a numeric array and a string array.
 */
public class P17Array {
    public static void main(String[] args) {
         array();
    }
    public static void array(){
        int n_array [] = new int[6];
        String s_array [] = new String[6];
        Scanner scan = new Scanner(System.in);
        System.out.println("Which bunch you want to sort???");
        System.out.println("Please enter 1 if you want to sort numbers.");
        System.out.println("Please enter 2 if you want to sort names.");
        int user = scan.nextInt();
        if (user == 1) {
            System.out.println("Enter your 6 number which you want to sort:");
            System.out.println("Enter first number:");
            n_array[0] = scan.nextInt();
            System.out.println("Enter second number:");
            n_array[1] = scan.nextInt();
            System.out.println("Enter third number:");
            n_array[2] = scan.nextInt();
            System.out.println("Enter forth number:");
            n_array[3] = scan.nextInt();
            System.out.println("Enter fifth number:");
            n_array[4] = scan.nextInt();
            System.out.println("Enter sixth number:");
            n_array[5] = scan.nextInt();
            System.out.println("Original numeric array : " + Arrays.toString(n_array));
            Arrays.sort(n_array);
            System.out.println("Sorted numeric array : " + Arrays.toString(n_array));
        } else if (user == 2) {
            System.out.println("Enter your 6 names which you want to sort:");
            System.out.println("Enter first name:");
            s_array[0] = scan.next();
            System.out.println("Enter second name:");
            s_array[1] = scan.next();
            System.out.println("Enter third name:");
            s_array[2] = scan.next();
            System.out.println("Enter forth name:");
            s_array[3] = scan.next();
            System.out.println("Enter fifth name:");
            s_array[4] = scan.next();
            System.out.println("Enter sixth name:");
            s_array[5] = scan.next();
            System.out.println("Original name array : " + Arrays.toString(s_array));
            Arrays.sort(s_array);
            System.out.println("Sorted name array : " + Arrays.toString(s_array));
        }else{
            System.out.println("Invalid input");
        }
        scan.close();
    }
}
