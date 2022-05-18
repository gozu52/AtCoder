import java.util.*;

public class C_NotSoDiverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[200001];
        for(int i=0; i<n; i++)a[sc.nextInt()]++;
        sc.close();
        Arrays.sort(a);
        int ans = 0;
        for(int i=0;i<a.length-k;i++)if(a[i]>0)ans += a[i];
        System.out.println(ans);
    }
}
