package homework;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or not?
 */
public class P02LeapYear {
    public static void main(String[] args) {
        P02LeapYear obj = new P02LeapYear();
        obj.leapYear();
    }
    public void leapYear(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter year:");
        int year = scan.nextInt();
        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = ((year % 100 == 0) && (year % 400 == 0));

        if (x && (y || z))
        {
            System.out.println(year + " is a leap year");
        }
        else
        {
            System.out.println(year + " is not a leap year");
        }
        scan.close();
    }
}
