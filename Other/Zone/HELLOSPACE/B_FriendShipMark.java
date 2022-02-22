package Other.Zone.HELLOSPACE;

import java.util.*;

public class B_FriendShipMark {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt(), h = sc.nextInt();
        double ans = 0;
        for(int i=0;i<n;i++){
            double x = sc.nextInt(), y = sc.nextInt();
            double tmp = (h-y)/(d-x);
            ans = Math.max(ans, y-tmp*x);
        }
        sc.close();
        System.out.println(ans);
    }
}
