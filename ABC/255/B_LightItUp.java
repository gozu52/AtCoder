import java.util.*;

public class B_LightItUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[k];
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<k;i++){
            a[i] = sc.nextInt()-1;
            list.add(a[i]);
        }
        double[][] xy = new double[n][2];
        for(int i=0;i<n;i++){
            xy[i][0] = sc.nextDouble();
            xy[i][1] = sc.nextDouble();
        }
        sc.close();
        double ans = 0.0;
        for(int i=0;i<n;i++){
            if(list.contains(i))continue;
            double min = Double.MAX_VALUE;
            for(int j=0;j<k;j++){
                min = Math.min(min, Math.sqrt(Math.pow(xy[i][0]-xy[a[j]][0], 2)+Math.pow(xy[i][1]-xy[a[j]][1], 2)));
            }
            ans = Math.max(min, ans);
        }
        System.out.println(ans);
    }
}
