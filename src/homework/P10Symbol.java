package homework;
import java.util.Scanner;

public class P10Symbol {
    public static void main(String[] args) {
        calculator();
    }
    public static void calculator(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int a = scan.nextInt();
        System.out.println("Please enter second number: ");
        int b = scan.nextInt();
        System.out.println("Enter + for addition");
        System.out.println("Enter - for subtraction");
        System.out.println("Enter * for multiplication");
        System.out.println("Enter / for division");
        char o = scan.next().charAt(0);
        if (o == '+'){
            System.out.println("Addition of " + a + " And " + b + " = " + (a+b));
        } else if (o == '-') {
            System.out.println("Subtraction of " + a + " And " + b + " = " + (a-b));
        }else if (o == '*') {
            System.out.println("Multiplication of " + a + " And " + b + " = " + (a*b));
        }else if (o == '/') {
            System.out.println("Division of " + a + " And " + b + " = " + (a/b));
        }else {
            System.out.println("Invalid Input");
        }
        scan.close();
    }
}
