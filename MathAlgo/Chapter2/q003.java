package MathAlgo.Chapter2;

import java.util.*;

public class q003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i=0;i<n;i++)sum+=sc.nextInt();
        sc.close();
        System.out.println(sum);
    }
}