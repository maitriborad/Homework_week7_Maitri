package homework;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class P06OddEven {
    public static void main(String[] args) {
        P06OddEven obj = new P06OddEven();
        obj.oddEven();
    }
    public void oddEven(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = scan.nextInt();
        if(num % 2 == 0) {
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }
        scan.close();
    }
}
