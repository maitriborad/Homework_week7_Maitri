package homework;

import java.util.Scanner;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class P19AvgArray {
    public static void main(String[] args) {
        P19AvgArray obj = new P19AvgArray();
        obj.avg();
    }
    public void avg(){
        int n, sum = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        n = scan.nextInt();
        int a[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = scan.nextInt();
            sum = sum + a[i];
        }
        float avg = sum/n;
        System.out.println("Average of the array is:"+avg);
        scan.close();
    }
}
