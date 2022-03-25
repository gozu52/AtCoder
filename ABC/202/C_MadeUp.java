import java.util.*;

public class C_MadeUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long cnt = 0;
        int[] a = new int[n+1];int[] b = new int[n+1];
        for(int i=1;i<=n;i++)a[sc.nextInt()]++;
        for(int i=1;i<=n;i++)b[i]=a[sc.nextInt()];
        for(int i=1;i<=n;i++)cnt+=b[sc.nextInt()];
        sc.close();
        System.out.println(cnt);
    }
}
