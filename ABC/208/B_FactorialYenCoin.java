import java.util.Scanner;

public class B_FactorialYenCoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = Integer.parseInt(sc.next());
        sc.close();
        int cnt =0;
        for(int i=10;i>1;i--){
            while(p>=factorial(i)){
                p-=factorial(i);
                cnt++;
            }
        }
        System.out.println(cnt + p);
    }
    public static int factorial(int num){
        int ans = 1;
        for(int i=1;i<=num;i++){
            ans *=i;
        }
        return ans;
    }
}
