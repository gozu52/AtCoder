package MathAlgo.Chapter3;

import java.util.Scanner;

public class q026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        double ans = 0.0;
        for(int i=n;i>=1;i--)ans += 1.0*n/i;
        System.out.println(ans);
    }
}