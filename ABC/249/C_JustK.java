import java.util.*;

public class C_JustK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++)s[i] = sc.next();
        sc.close();
        int ans = 0;
        for(int i=0;i<(1<<n);i++){
            int[] alfa = new int[26];
            for(int j=0;j<n;j++){
                if((i&(1<<j))!=0){
                    for(int l=0;l<s[j].length();l++){
                        alfa[s[j].charAt(l)-'a']++;
                    }
                }
            }
            int cnt = 0;
            for(int j=0;j<26;j++)if(alfa[j]==k)cnt++;
            ans = Math.max(ans, cnt);
        }
        System.out.println(ans);        
    }
}
