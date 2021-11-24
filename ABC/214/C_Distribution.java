import java.util.Scanner;

public class C_Distribution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] s = new int[n];
        int[] t = new int[n];
        for(int i=0;i<n;i++){
            s[i] = Integer.parseInt(sc.next());
        }
        for(int i=0;i<n;i++){
            t[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        long[] ans = copy(t);
        long c[] = passJewel(t, s,ans);
        for(long e: c)System.out.println(e);
    }
    public static long[] passJewel(int[] t,int[] s,long[] ans){
        for(int i=1;i<t.length;i++){
            ans[i] = Math.min(ans[i-1]+s[i-1], t[i]);
        }
        ans[0] = Math.min(ans[t.length-1]+s[t.length-1], t[0]);
        for(int i=1;i<t.length;i++){
            ans[i] = Math.min(ans[i-1]+s[i-1], t[i]);
        }
        return ans;
    }
    public static long[] copy(int[] t){
        long[] ans = new long[t.length];
        for(int i=0;i<t.length;i++){
            ans[i] = t[i];
        }
        return ans;
    }
}
