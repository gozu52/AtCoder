import java.util.*;

public class B_WhoIsMissing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int card = 4*n -1;
        int[] a = new int[card];
        for(int i=0;i<card;i++)a[i] = Integer.parseInt(sc.next());
        sc.close();
        int[] cnt = new int[n+1];
        for(int i=0;i<card;i++)cnt[a[i]]++;
        for(int i=1;i<=n;i++)if(cnt[i]==3)System.out.println(i);
    }
}
