import java.util.Scanner;

public class A_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        double c = b/a;
        System.out.println(100-c*100);
    }
}
