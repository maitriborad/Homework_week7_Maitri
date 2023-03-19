package homework;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”
 */
public class P16Number {
    public static void main(String[] args) {
        checkNumber();
    }
    public static void checkNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number: ");
        int num = scan.nextInt();
        if(num>0){
            System.out.println(num +" is POSITIVE number");
        } else if (num<0) {
            System.out.println(num +" is NEGATIVE number");
        } else if (num==0) {
            System.out.println(num + " is ZERO");
        }else {
            System.out.println("Please enter valid number");
        }
        scan.close();
    }
}
