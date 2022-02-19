import java.util.*;

public class A_Horizon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long h = sc.nextInt();
        sc.close();
        double ans = Math.sqrt(h*(12800000+h));
        System.out.println(ans);
    }
}
