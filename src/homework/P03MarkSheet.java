package homework;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message
 * “Invalid Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade
 * if %> = 80 A+, %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * |                               |
 * |        Mark Sheet             |
 * |_______________________________|
 * |        Name : Jay             |
 * |        Roll No : 08           |
 * |_______________________________|
 * |        Subjects : Marks       |
 * |_______________________________|
 * |        Math : 98              |
 * |       Science : 90            |
 * |        English : 85           |
 * |_______________________________|
 * |        Total : 273            |
 * |_______________________________|
 * |       Percentage : 91.0       |
 * |         Result : Pass         |
 * |          Grade : A+           |
 * |_______________________________|
 */
public class P03MarkSheet {
    public static void main(String[] args) {
        markSheet();
    }
    static String name;
    static int no;
    static int total;
    static float per;
    static String result;
    static String grade;
    static int[] marks = new int[3];
    public static void markSheet() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input your name: ");
        String name = scan.nextLine();
        System.out.println("Input your roll no: ");
        int no = scan.nextInt();
        System.out.println("Enter your maths marks: ");
        marks[0] = scan.nextInt();
        if (marks[0] <= 100 && marks[0] >= 0) {
            System.out.println("Enter your science marks: ");
            marks[1] = scan.nextInt();
            if (marks[1] <= 100 && marks[1] >= 0) {
                System.out.println("Enter your english marks: ");
                marks[2] = scan.nextInt();
                if (marks[2] <= 100 && marks[2] >= 0) {
                    total = (marks[0] + marks[1] + marks[2]);
                    per = (total / 3);
                    if (per <= 100 && per >= 80) {
                        result = "PASS";
                        grade = "A+";
                        print();
                    } else if (per < 80 && per >= 70) {
                        result = "PASS";
                        grade = "A";
                        print();
                    } else if (per < 70 && per >= 50) {
                        result = "PASS";
                        grade = "B";
                        print();
                    } else if (per < 50 && per >= 35) {
                        result = "PASS";
                        grade = "C";
                        print();
                    } else {
                        result = "FAIL";
                        grade = "FAIL";
                        print();
                    }
                } else {
                    System.out.println("PLEASE ENTER VALID MARKS");
                }
            } else {
                System.out.println("PLEASE ENTER VALID MARKS");
            }
        } else {
            System.out.println("PLEASE ENTER VALID MARKS");
        }
        scan.close();
    }
        public static void print(){
        System.out.println("_______________________________");
        System.out.println("|                             |");
        System.out.println("|          MARK-SHEET         |");
        System.out.println("|-----------------------------|");
        System.out.println("|    Name       :    " + name + "   |");
        System.out.println("|    Roll No    :       " + no + "    |");
        System.out.println("|    Subjects   :     Marks   |");
        System.out.println("|    Maths      :      " + marks[0] + "     |");
        System.out.println("|    Science    :      " + marks[1] + "     |");
        System.out.println("|    English    :      " + marks[2] + "     |");
        System.out.println("|-----------------------------|");
        System.out.println("|    Total      :      " + total + "    |");
        System.out.println("|-----------------------------|");
        System.out.println("|    Percentage :      " + per + "%  |");
        System.out.println("|    Result     :      " + result + "   |");
        System.out.println("|    Grade      :      " + grade + "      |");
        System.out.println("|-----------------------------|");
    }
}
