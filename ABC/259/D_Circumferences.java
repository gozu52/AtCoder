import java.util.*;

public class D_Circumferences {
    static long[] x , y ,r;
    static boolean[] used;
    static int startc = 0, endc = 0; 
    static List<List<Integer>> list;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sx = sc.nextInt(), sy = sc.nextInt();
        int ex = sc.nextInt(), ey = sc.nextInt();
        list = new ArrayList<>();
        used = new boolean[n];
        for(int i=0;i<n;i++)list.add(new ArrayList<>());
        x = new long[n]; y = new long[n]; r = new long[n];
        for(int i=0;i<n;i++){
            x[i] = sc.nextLong();
            y[i] = sc.nextLong();
            r[i] = sc.nextLong();
            if((x[i]-sx)*(x[i]-sx)+(y[i]-sy)*(y[i]-sy)==r[i]*r[i])startc = i;
            if((x[i]-ex)*(x[i]-ex)+(y[i]-ey)*(y[i]-ey)==r[i]*r[i])endc = i;
        }
        sc.close();
        for(int i=0;i<n;i++)for(int j=i+1;j<n;j++){
            if(circleMeet(i, j)){
                list.get(i).add(j);
                list.get(j).add(i);
            }
        }
        System.out.println(dfs(startc)?"Yes":"No");
    }
    static boolean circleMeet(int i, int j){
        long tmp = (x[i]-x[j])*(x[i]-x[j])+(y[i]-y[j])*(y[i]-y[j]);
        if(tmp<(r[i]-r[j])*(r[i]-r[j]) || tmp>(r[i]+r[j])*(r[i]+r[j])){
            return false;
        }
        return true;
    }
    static boolean dfs(int v){
        used[v] = true;
        if(v==endc)return true;
        for(int e: list.get(v)){
            if(!used[e])if(dfs(e))return true;
        }
        return false;
    }
}
