import java.util.*;

public class C_CreamPuff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		TreeSet<Long> set = new TreeSet<Long>();
		set = calc(n);
		for(long e: set)System.out.println(e);
	}
	static TreeSet<Long> calc(long n){
		TreeSet<Long> set = new TreeSet<Long>();
		for(long i=1;i*i<=n;i++){
			if(n%i==0){
				set.add(i);
				set.add(n/i);
			}
		}
		return set;
	}
}
