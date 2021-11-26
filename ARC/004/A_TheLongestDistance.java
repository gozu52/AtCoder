import java.util.Scanner;

public class A_TheLongestDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        double[][] xy = new double[n][2];
        for(int i=0;i<n;i++){
            xy[i][0] = Double.parseDouble(sc.next());
            xy[i][1] = Double.parseDouble(sc.next());
        }
        sc.close();
        double ans = 0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                ans = Math.max(ans, Math.sqrt(Math.pow((xy[j][0]-xy[i][0]),2)+Math.pow((xy[j][1]-xy[i][1]),2)));
            }
        }
        System.out.println(ans);
    }
}