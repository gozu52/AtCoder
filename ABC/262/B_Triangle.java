import java.util.*;

public class B_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] u = new int[m];
        int[] v = new int[m];
        List<List<Integer>> graph = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<Integer>());
        }
        for(int i=0;i<m;i++){
            u[i] = sc.nextInt()-1;
            v[i] = sc.nextInt()-1;
            graph.get(u[i]).add(v[i]);
            graph.get(v[i]).add(u[i]);
        }
        sc.close();
        long cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(graph.get(i).contains(j)&&graph.get(i).contains(k)&&graph.get(j).contains(k)){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
