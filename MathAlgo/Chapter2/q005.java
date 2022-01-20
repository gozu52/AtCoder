package MathAlgo.Chapter2;

import java.util.Scanner;

public class q005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        sc.close();
        int sum = 0;
        for(int i=0;i<n;i++)sum += a[i];
        System.out.println((sum%100));
    }
}
