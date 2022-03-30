import java.util.*;

public class C_FlipFlipAndFlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt(), m = sc.nextInt();
        sc.close();
        long ans = 0;
        if(n==1 && m==1)ans = 1;
        else if(n==1 || m==1)ans = Math.max(n, m)-2;
        else ans = (n-2)*(m-2);
        System.out.println(ans);
    }
}
