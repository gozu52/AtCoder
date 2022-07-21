import java.util.*;

public class C_ChangingJewels {
    static long r=0, b =0;
    static long[] rrr, brr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        sc.close();
        r=n;
        rrr = new long[11];
        brr = new long[11];
        rrr[(int)n] = 1;
        if(n<=1){System.out.println(0);return;}
        red(x, y);
        System.out.println(brr[1]);
    }
    static void red(long x, long y){
        for(int i=10;i>=2;i--){
            brr[i] += rrr[i]*x;
            rrr[i-1] += rrr[i];
            rrr[i] = 0;
            brr[i-1] += brr[i]*y;
            rrr[i-1] += brr[i];
        }
    }
}
