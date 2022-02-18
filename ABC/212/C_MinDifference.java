import java.util.*;

public class C_MinDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 0; i < m; i++) b[i] = sc.nextInt();
        sc.close();
        Arrays.sort(a);
        Arrays.sort(b);
        int ans = Integer.MAX_VALUE;
        int x = 0, y = 0;
        while (x < n && y < m) {
            ans = Math.min(ans, Math.abs(a[x] - b[y]));
            if (a[x] <= b[y]) x++;
            else y++;
        }
        System.out.println(ans);
    }
}
