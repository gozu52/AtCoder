import java.util.*;

public class B_SimilarArrays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)a[i] = sc.nextInt();
		sc.close();
		int odds = 1;
		for(int i=0;i<n;i++){
			int tmp = 0;
			for(int j=a[i]-1;j<=a[i]+1;j++){
				if(j%2!=0)tmp++;
			}
			odds *= tmp;
		}
		System.out.println((int)(Math.pow(3, n))-odds);
	}
}
