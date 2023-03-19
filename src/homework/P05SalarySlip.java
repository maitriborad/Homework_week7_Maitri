package homework;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
 * HRA = basic salary 10% DA = Basic salary 8% TA = Basic salary 9% PF= Basic salary 20% Gross
 * salary = basic salary + HRA + TA + DA –PF Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */
public class P05SalarySlip {
    public static void main(String[] args) {
         P05SalarySlip obj = new P05SalarySlip();
         obj.salary();
    }
    public void salary(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input your Employee ID: ");
        int id = scan.nextInt();
        System.out.println("Please enter your name: ");
        String name = scan.next();
        System.out.println("Please input your basic Salary: ");
        long salary = scan.nextLong();
        double hra = 0.10 * salary;
        double da = 0.08 * salary;
        double ta = 0.09 * salary;
        double pf = 0.20 * salary;
        double gs = salary + hra + da + ta - pf;
        System.out.println("_______________________________");
        System.out.println("|        SALARY SLIP          |");
        System.out.println("|_____________________________|");
        System.out.println("| Employee ID   :    " + id + "     |");
        System.out.println("| Employee name :    " + name + "   |");
        System.out.println("|_____________________________|");
        System.out.println("| Basic Salary  :   " + salary + "     |");
        System.out.println("| HRA 10%       :   " + hra + "    |");
        System.out.println("| TA 8%         :   " + ta + "    |");
        System.out.println("| DA 9%         :   " + da + "    |");
        System.out.println("| PF -20&       :   " + pf + "    |");
        System.out.println("|_____________________________|");
        System.out.println("| Gross Pay     :   " + gs + "   |");
        System.out.println("|=============================|");
        scan.close();
    }
}
