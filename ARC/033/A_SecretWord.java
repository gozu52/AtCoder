import java.util.*;

public class A_SecretWord {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		long ans = 0;
		for(int i=1;i<=n;i++)ans += i;
		System.out.println(ans);
	}
}
