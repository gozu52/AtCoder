import java.util.Scanner;

public class B_TwoColorsCardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++)s[i] = sc.next();
        int m = sc.nextInt();
        String[] t = new String[m];
        for(int i=0;i<m;i++)t[i] = sc.next();
        sc.close();
        int ans = 0;
        for(int i=0;i<n;i++){
            int cntB = 0;
            for(int j=i;j<n;j++){
                if(s[i].equals(s[j]))cntB++;
            }
            int cntR=0;
            for(int j=0;j<m;j++){
                if(s[i].equals(t[j]))cntR++;
            }
            ans = Math.max(ans, cntB-cntR);
        }
        System.out.println(ans);
    }
}
