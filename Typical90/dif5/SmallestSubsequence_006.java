import java.util.*;

public class SmallestSubsequence_006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        char[] s = sc.next().toCharArray();
        sc.close();
        StringBuilder sb = new StringBuilder();
        int l = 0, r = n-k+1;
        for(int i=0;i<k;i++){
            int index = 0, ans = Integer.MAX_VALUE;
            for(int j=l;j<r;j++){
                if(ans > (int)s[j]){
                    index = j;
                    ans = (int)s[j];
                }
            }
            sb.append((char)ans);
            l = index + 1;r++;
        }
        System.out.println(sb);
    }
}
