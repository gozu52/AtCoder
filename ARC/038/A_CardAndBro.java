import java.util.Arrays;
import java.util.Scanner;

public class A_CardAndBro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = Integer.parseInt(sc.next());
        sc.close();
        Arrays.sort(a);
        int ans = 0;
        for(int i=n-1;i>=0;i-=2){
            ans += a[i];
        }
        System.out.println(ans);
    }
}
