import java.util.*;

public class B_CollectingBallsEasy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        long ans = 0;
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            ans += Math.min(Math.abs(x-0)*2, Math.abs(x-k)*2);
        }
        sc.close();
        System.out.println(ans);
    }
}
