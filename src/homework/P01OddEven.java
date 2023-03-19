package homework;
import java.util.Scanner;
/**
 * Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :)
 */
public class P01OddEven {
    public static void main(String[] args) {
         P01OddEven obj = new P01OddEven();
         obj.oddEven();
    }
    public void oddEven(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = scan.nextInt();
        String result = num%2==0 ? "Even" : "Odd";
            System.out.println(num +" is " + result + " number");
        scan.close();
    }
}