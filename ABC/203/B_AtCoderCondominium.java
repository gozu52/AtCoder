import java.util.Scanner;

public class B_AtCoderCondominium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        sc.close();
        int ans =0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                ans += (i*100) + j;
            }
        }
        System.out.println(ans);
    }
}