package homework;

import java.util.Scanner;

/**
 * Number of Days In Month
 * Write a method isLeapYear with a parameter of type int named year. The parameter needs to be
 * greater than or equal to 1 and less than or equal to 9999. If the parameter is not in that
 * range return false. Otherwise, if it is in the valid range, calculate if the year is a leap
 * year and return true if it is, otherwise return false. A year is a leap year if it is divisible
 * by 4 but not by 100, or it is divisible by 400.
 * Example of input/Output:
 * ● isLeapYear(-1600); should return false since the parameter is not in the range(1-9999)
 * ● isLeapYear(1600); should return true since 1600 is a leap year
 * ● isLeapYear(2017); should return false since 2017 is not a leap year
 * ● isLeapYear(2000);should return true because 2000 is a leap year
 * Write another method getDaysInMonth with two parameter month and year.
 * Both of type int. If parameter month is < 1 or >12 return -1.
 * If parameter year is <1 or >9999 than return -1.
 * This method needs to return the number of days in the month.
 * Be careful about leap years they have 29 days in month 2 (February).
 * You should check if the year is a leap year using the method isLeapYear describe above.
 */
public class P04DayInMonth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter month: ");
        int month = scan.nextInt();
        System.out.println("Please enter Year: ");
        int year = scan.nextInt();
        int result = getDaysInMonth(month,year);
        System.out.println(result + " Days are in month " + month + " of " + year);
        scan.close();
    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999){
            return false;
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            return true;
        } else if (year % 100 == 0 && year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
    static int day;
    public static int getDaysInMonth(int month, int year) {
        //int day;
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            System.out.println("Invalid input");
        } else {
            switch (month){
                case 2:
                    if (isLeapYear(year) == true){
                        day = 29;
                        break;
                    }else {
                        day = 28;
                        break;
                    }
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    day = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    day = 30;
                    break;
                default:
                    day = 0;
            }
        }
        return day;
    }
}