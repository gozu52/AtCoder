import java.util.*;

public class C_MinMaxPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt()-1;
        sc.close();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++)if(a[i]==i)list.add(i);
        long ans = 0, cnt = 0,sum = 0;
        for(int i=0;i<n;i++){
            if(i==a[a[i]] && a[i]!=i)sum++;
            if(a[i]==i)cnt++;
        }
        sum = sum/2;
        for(long i=cnt-1;i>=0;i--)ans += i;
        System.out.println(ans+sum);
    }
}
