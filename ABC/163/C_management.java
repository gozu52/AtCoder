import java.util.*;

public class C_management {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n-1];
        for(int i=0;i<n-1;i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int[] ans = new int[n];
        for(int i=0;i<n-1;i++)ans[a[i]-1]++;
        for(int i=0;i<n;i++)System.out.println(ans[i]);
    }
}
