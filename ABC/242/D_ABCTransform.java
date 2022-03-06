import java.util.*;

public class D_ABCTransform {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<q;i++){
            long t = sc.nextLong();
            long k = sc.nextLong()-1;
            sb.append(base(s, t, k)+"\n");            
        }
        sc.close();
        System.out.println(sb);
    }
	static char base(char[] s ,long t, long k) {
		if (t == 0) return s[(int)k];
		if (k == 0) return calc(s[0], t);
		return calc(base(s ,t - 1, k / 2), k % 2 + 1);
	}
    // k==0 or recursion without t!=0
	static char calc(char c, long add) {
		return (char) ('A' + (c - 'A' + add) % 3);
	}    
}
