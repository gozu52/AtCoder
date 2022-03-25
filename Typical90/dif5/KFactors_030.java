import java.util.*;

public class KFactors_030 {
    //解説AC
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] cnt = new int[n + 1];
		sc.close();

		for ( int i = 2 ; i <= n ; i++ ) {
			if ( cnt[i] > 0 ) {
				continue;
			}
			int cur = 0;
			while ( (cur += i) <= n ) {
				cnt[cur]++;
			}
		}
		int ans = 0;
		for ( int i = 2 ; i <= n ; i++ ) {
			if ( cnt[i] >= k ) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
