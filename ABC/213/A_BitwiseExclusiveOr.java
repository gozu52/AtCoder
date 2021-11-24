import java.util.Scanner;

public class A_BitwiseExclusiveOr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();
        System.out.println(a ^ b);
    }
}
