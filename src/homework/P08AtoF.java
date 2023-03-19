package homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 */
public class P08AtoF {
    public static void main(String[] args) {
        P08AtoF obj = new P08AtoF();
        obj.city();
    }
    public void city(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any alphabet from A to F: ");
        String a = scan.next();
        if(a.equals("A")){
            System.out.println("Aberdeen");
        } else if (a.equals("B")) {
            System.out.println("Belfast");
        } else if (a.equals("C")) {
            System.out.println("Cardiff");
        } else if (a.equals("D")) {
            System.out.println("Derby");
        } else if (a.equals("E")) {
            System.out.println("Edinburgh");
        } else if (a.equals("F")) {
            System.out.println("Freak");
        }else {
            System.out.println("Invalid Entry");
        }
        scan.close();
    }
}
