import java.util.*;

public class D_PrimeSumGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int c = sc.nextInt(), d = sc.nextInt();
        sc.close();
        for(int i=a;i<=b;i++){
            int cnt =0;
            for(int j=c;j<=d;j++){
                if(!isPrime(i+j))cnt++;
            }
            if(cnt==d-c+1){
                System.out.println("Takahashi");
                return;
            }
        }
        System.out.println("Aoki");
    }
    static boolean isPrime(int n){
        if(n<2)return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)return false;
        }
        return true;
    }
}
