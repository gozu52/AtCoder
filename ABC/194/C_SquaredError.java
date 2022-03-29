import java.util.Scanner;

public class C_SquaredError {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans1 = 0, ans2 = 0;
        for(int i=0;i<n;i++){
            long a = sc.nextLong();
            ans1 += a*a; ans2 += a;
        }
        sc.close();
        System.out.println((ans1*n)-(ans2*ans2));
    }
}
