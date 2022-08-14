import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n+1];
        for(int i=2;i<n+1;i++){
            p[i] = sc.nextInt();
        }
        sc.close();
        int ans = 0, pos =n;
        while(pos>1){
            pos = p[pos];
            ans++;
        }
        System.out.println(ans);
    }
}
