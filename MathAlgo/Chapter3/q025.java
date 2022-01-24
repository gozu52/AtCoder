package MathAlgo.Chapter3;

import java.util.Scanner;

public class q025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans =0.0;
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        for(int i=0;i<n;i++)b[i] = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)ans += (1.0/3.0)*a[i]+(2.0/3.0)*b[i];
        System.out.println(ans);
    }
}
