package MathAlgo.Chapter3;

import java.util.*;

public class q012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        if(primeNum(n))System.out.println("Yes");
        else System.out.println("No");
    }
    static boolean primeNum(long n){
        for(long i=2;i*i<=n;i++)if(n%i==0)return false;
        return true;
    }
}
