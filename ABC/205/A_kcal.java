import java.util.Scanner;

public class A_kcal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        double b = Double.parseDouble(sc.next());
        sc.close();
        double ans = a * (b/100);
        System.out.println(ans);
    }
}
