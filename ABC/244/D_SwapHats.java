import java.util.*;

public class D_SwapHats {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = "";
		String t = "";
		for(int i=0;i<3;i++){
			s += sc.next();
		}
		for(int i=0;i<3;i++){
			t += sc.next();
		}
		sc.close();
		for(int i=0;i<3;i++){
			if(!t.contains(String.valueOf(s.charAt(i)))){
				System.out.println("No");
				return;
			}
		}
		if(s.equals(t)){
			System.out.println("Yes");
			return;
		}
		String s1 = String.valueOf(s.charAt(1))+String.valueOf(s.charAt(0))+String.valueOf(s.charAt(2));
		String s2 = String.valueOf(s.charAt(2))+String.valueOf(s.charAt(1))+String.valueOf(s.charAt(0));
		String s3 = String.valueOf(s.charAt(0))+String.valueOf(s.charAt(2))+String.valueOf(s.charAt(1));
		if(t.equals(s1) || t.equals(s2) || t.equals(s3)){
			System.out.println("No");
			return;
		}
		System.out.println("Yes");
	}
}
