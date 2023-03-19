package homework;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
 * if any other alphabet should be invalid entry
 * using switch
 */
public class P09AtoFSwitch {
    public static void main(String[] args) {
        P09AtoFSwitch obj = new P09AtoFSwitch();
        obj.city();
    }
    public static void city(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input any alphabet from A to F: ");
        String a = scan.next();
        switch (a){
            case "A":
            System.out.println("Aberdeen");
            break;
            case "B":
            System.out.println("Belfast");
            break;
            case "C":
            System.out.println("Cardiff");
            break;
            case "D":
            System.out.println("Derby");
            break;
            case "E":
            System.out.println("Edinburgh");
            break;
            case "F":
            System.out.println("Freak");
            break;
            default:
            System.out.println("Invalid Entry");
        }
        scan.close();
    }
}