import java.util.*;

public class B_FoodsLovedByEveryone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
            int k = sc.nextInt();
            for(int j=0;j<k;j++)list.get(i).add(sc.nextInt());
        }
        int ans = 0;
        for(int i=1;i<=m;i++){
            int cnt = 0;
            for(int j=0;j<n;j++)if(list.get(j).contains(i))cnt++;
            if(cnt==n)ans++;
        }
        sc.close();
        System.out.println(ans);
    }
}
