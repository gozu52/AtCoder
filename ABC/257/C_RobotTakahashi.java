import java.util.*;

public class C_RobotTakahashi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int[][] w = new int[n][2];
        long tmp = 0;
        for(int i=0;i<n;i++){
            w[i][0] = sc.nextInt();
            w[i][1] = Character.getNumericValue(s.charAt(i));
            tmp += w[i][1];
        }
        sc.close();
        Arrays.sort(w,(x,y)->Integer.compare(x[0],y[0]));
        long ans = tmp;
        for(int i=0;i<n;i++){
            if(w[i][1]==1)tmp--;
            else tmp++;
            if(i<(n-1)){
                if(w[i][0]!=w[i+1][0]) ans = Math.max(ans,tmp);
            }else {ans = Math.max(ans, tmp);}
        }
        System.out.println(ans);
    }
}
