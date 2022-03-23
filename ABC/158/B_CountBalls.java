import java.util.*;

public class B_CountBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong(), b = sc.nextLong();
        sc.close();
        long ans = 0;
        if(a>n){
            ans = n;
        }else if(a+b>n){
            ans = a;
        }else{
            if(n%(a+b)==0){
                ans = n/(a+b) * a;
            }else if(n%(a+b)<=a){
                ans = n/(a+b) * a + n%(a+b);
            }else{
                ans = n/(a+b) * a + a;
            }
        }
        System.out.println(ans);
    }
}
