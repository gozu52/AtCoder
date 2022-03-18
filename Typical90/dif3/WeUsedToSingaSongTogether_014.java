import java.util.*;

public class WeUsedToSingaSongTogether_014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];int[] b = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        for(int i=0;i<n;i++)b[i] = sc.nextInt();
        sc.close();
        Arrays.sort(a);Arrays.sort(b);
        long ans = 0;
        for(int i=0;i<n;i++){
            ans += Math.abs(a[i]-b[i]);
        }
        System.out.println(ans);
    }
}
