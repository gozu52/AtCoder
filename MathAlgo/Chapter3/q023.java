package MathAlgo.Chapter3;

import java.util.Scanner;

public class q023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double b = 0;
        double r = 0;
        for(int i=0;i<n;i++)b+=sc.nextInt();
        for(int i=0;i<n;i++)r+=sc.nextInt();
        sc.close();
        System.out.println((b/n)+(r/n));
    }
}
