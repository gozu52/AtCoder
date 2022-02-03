import java.util.*;

public class C_Product {
    static boolean[] seen;
    static List<List<Integer>> list;
    static int ans;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x = sc.nextLong();
        list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
            int L = sc.nextInt();
            for(int j=0;j<L;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        sc.close();
        dfs(0, n, x);
        System.out.println(ans);    
    }
    static void dfs(int i,int n,long x){
        if(i==n){
            if(x==1)ans++;
            return;
        }
        int m = list.get(i).size();
        for(int j=0;j<m;j++){
            if(x%list.get(i).get(j)==0){
                dfs(i+1,n,x/(list.get(i).get(j)));
            }
        }
    }
}
