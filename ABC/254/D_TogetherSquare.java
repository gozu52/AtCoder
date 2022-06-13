import java.util.Scanner;

public class D_TogetherSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long ans = 0;
        for(long i=1;i<=n;i++){
            long tmp = i;
            for(long j=2;j*j<=tmp;j++){
                while(tmp%(j*j)==0)tmp/=(j*j);
            }
            for(long j=1;j*j*tmp<=n;j++)ans++;
        }
        System.out.println(ans);
    }
}
