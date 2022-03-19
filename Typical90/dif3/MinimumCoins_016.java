import java.util.Scanner;

public class MinimumCoins_016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();
        long ans = Integer.MAX_VALUE;
        for(int i=0;i<=9999;i++){
            for(int j=0;j<=9999-i;j++){
                if((n-a*i-b*j>=0) && (n-a*i-b*j)%c==0){
                    long tmp = i+j+(n-a*i-b*j)/c;
                    if(tmp<ans)ans = tmp;
                }
            }
        }
        System.out.println(ans);
    }
}
