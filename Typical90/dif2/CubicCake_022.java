import java.util.Scanner;

public class CubicCake_022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
        sc.close();
        long gcd = gcd(gcd(a,b),c);
        System.out.println(a/gcd-1+b/gcd-1+c/gcd-1);
    }
    static long gcd(long a, long b){
        while(b>0){long tmp = a%b;a = b;b = tmp;}
        return a;
    }
}
