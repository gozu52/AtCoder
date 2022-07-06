import java.util.*;

public class B_NumberBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] a = new long[n][n];
        for(int i=0;i<n;i++){
            String tmp = sc.next();
            for(int j=0;j<n;j++)a[i][j] = tmp.charAt(j) - '0';
        }
        sc.close();
        int[][] d = {{1,0},{1,1},{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1}};
        long ans = 0L;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<8;k++){
                    long tmp = a[i][j];
                    for(int l=1;l<n;l++){
                        tmp *= 10L;
                        tmp += a[(n+i+d[k][0]*l)%n][(n+j+d[k][1]*l)%n];
                        System.out.println(tmp);
                    }
                    ans = Math.max(ans, tmp);
                }
            }
        }
        System.out.println(ans);
    }
}
