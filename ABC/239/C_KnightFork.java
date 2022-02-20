import java.util.*;

public class C_KnightFork {
    static final long mod = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        sc.close();
        double ans = Math.sqrt(5);        
        for(int i=(int)(x1-5); i<=5+x1; i++){
            for(int j=(int)(y1-5);j<=5+y1;j++){
                if(Math.sqrt(Math.pow(x1-i,2)+Math.pow(y1-j,2))==ans && Math.sqrt(Math.pow(x2-i, 2)+Math.pow(y2-j,2))==ans){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("No");
    }
}
