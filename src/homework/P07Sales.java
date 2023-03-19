package homework;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and then
 * fined this sales
 * Commission Sales amount >= 50,000 35% Sales amount >= 30,000 20% >= 20,000 10% >= 10,000
 * 5% < 10,000 2%
 */
public class P07Sales {
    public static void main(String[] args) {
      P07Sales obj = new P07Sales();
      obj.sales();
    }
    public void sales(){
        double com;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your sales ID: ");
        int id = scan.nextInt();
        System.out.println("Please Enter your name: ");
        String name = scan.next();
        System.out.println("Please Enter your sales amount: ");
        long amt = scan.nextLong();
        System.out.println("Please Enter basic salary: ");
        long salary = scan.nextLong();
        if (amt >= 50000){
            com = 0.35 * amt;
        }else if (amt < 50000 && amt >= 30000){
            com = 0.20 * amt;
        } else if (amt < 30000 && amt >= 20000) {
            com = 0.10 * amt;
        } else if (amt < 20000 && amt >= 10000) {
            com = 0.05 * amt;
        } else if (amt < 10000 && amt >= 0) {
            com = 0.02 * amt;
        }else{
            com = 0;
            System.out.println("Invalid input of sales amount");
        }
        System.out.println(com+ " is commission amount of your sales " + amt);
        scan.close();
    }
}
