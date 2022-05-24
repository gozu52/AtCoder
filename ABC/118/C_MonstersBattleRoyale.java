import java.util.*;

public class C_MonstersBattleRoyale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        sc.close();
        Arrays.sort(a);
        int ans = a[0];
        for(int i=1;i<n;i++)ans = gcd(ans,a[i]);
        System.out.println(ans);
    }
    static int gcd(int a, int b){
        if(b==0)return a;
        return gcd(b, a%b);
    }
}
