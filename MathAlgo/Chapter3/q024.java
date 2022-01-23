package MathAlgo.Chapter3;

import java.util.*;

public class q024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans =0;
        for(int i=0;i<n;i++){
            double p = sc.nextDouble();
            double q = sc.nextDouble();
            ans += q/p;
        }
        sc.close();
        System.out.println(ans);
    }
}
