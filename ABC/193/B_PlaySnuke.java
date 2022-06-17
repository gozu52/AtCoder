import java.util.*;

public class B_PlaySnuke {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] apn = new int[n][3];
        for(int i=0;i<n;i++){
            apn[i][0] = sc.nextInt();
            apn[i][1] = sc.nextInt();
            apn[i][2] = sc.nextInt();
        }
        sc.close();
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(apn[i][2]-apn[i][0]>0)ans = Math.min(ans,apn[i][1]);
        }
        System.out.println(ans==Integer.MAX_VALUE?"-1":""+ans);
    }
}
