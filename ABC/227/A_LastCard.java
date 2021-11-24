import java.util.*;

public class A_LastCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int ans = 0;
        sc.close();
        while(k>n){
            k -=n;
        }
        if(k==n){
            if(a==1)ans=n;
            else ans = a-1;
        }else{
            if((a-1)+k<=n){
                ans += (a-1)+k;
            }else{
                ans += ((a-1)+k)-n;
            }
        }
        System.out.println(ans);
    }
}
