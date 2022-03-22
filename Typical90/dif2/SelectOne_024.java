import java.util.*;

public class SelectOne_024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=0;i<n;i++)b[i]=sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)k -= Math.abs(a[i]-b[i]);
        if(k%2==0 && k>=0)System.out.println("Yes");
        else System.out.println("No");
    }
}
