import java.util.Scanner;

public class A_Cabbages {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int ans = 0;

        if (a >= n) {
            ans = n * x;
        } else {
            ans = (a * x) + ((n - a) * y);
        }
        System.out.println(ans);
        sc.close();
    }
}
