import java.util.*;

public class D_FGOperation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		long mod = 998244353;
		for( int i = 0; i < N; i++ ) {
			A[i] = sc.nextInt();
		}
		sc.close();
		long[][] dp = new long[N][10];
		dp[0][A[0]]++;
		for( int i = 1; i < N; i++ ) {
			for( int j = 0; j < 10; j++ ) {
                dp[i][(j+A[i])%10] += dp[i-1][j] % mod;
                dp[i][(j*A[i])%10] += dp[i-1][j] % mod;
			}
		}
		for( long ans : dp[N-1] ) {
			System.out.println(ans);
		}	
	}
}
