import java.util.*;

public class A_TwoSequences2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        a[0] = sc.nextInt();
        long max =0;
        for(int i=1;i<n;i++){
            a[i] = Math.max(a[i-1], sc.nextInt());
        }
        for(int i=0;i<n;i++){
            long b = sc.nextLong();
            max = Math.max(max, a[i]*b);
            System.out.println(max);
        }
        sc.close();
    }
}
