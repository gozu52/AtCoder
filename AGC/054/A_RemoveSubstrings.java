import java.util.*;

public class A_RemoveSubstrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();
		if(s[0]!=s[n-1]){
			System.out.println(1);
			return;
		}
		for(int i=2;i<n-1;i++){
			if(s[0]!=s[i-1] && s[i]!=s[n-1]){
				System.out.println(2);
				return;
			}
		}
		System.out.println(-1);
	}
}
