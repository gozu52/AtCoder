import java.util.*;

public class A_2N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        sc.close();
        System.out.println((long)Math.pow(2, n));
    }
}