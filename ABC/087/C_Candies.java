import java.util.Scanner;

public class C_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[2][n];
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++)a[i][j]=sc.nextInt();
        }
        sc.close();
        int[] up = new int[n];
        up[0] = a[0][0];
        for(int i=1;i<n;i++){
            up[i] = up[i-1]+a[0][i];
        }
        int[] ans = new int[n];
        ans[0]=a[0][0]+a[1][0];
        for(int i=1;i<n;i++){
            ans[i] = a[1][i]+Math.max(ans[i-1], up[i]);
        }
        System.out.println(ans[n-1]);
    }
}
