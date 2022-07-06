import java.util.Scanner;

public class D_Trophy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        long[] a = new long[n], b = new long[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        sc.close();
        long sum = 0L, ans = Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(i+1>x)break;
            sum += a[i]+b[i];
            ans = Math.min(ans, sum+b[i]*(x-i-1));
        }
        System.out.println(ans);
    }
}
