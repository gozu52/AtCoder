package MathAlgo.Chapter3;

import java.util.Scanner;

public class q015 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        System.out.println(gcd(a, b));
    }
    static int gcd(int a, int b){
        while(a>=1 && b>=1){
            if(a<b)b=b%a;
            else a=a%b;
        }
        if(a>=1)return a;
        else return b;
    }
}
