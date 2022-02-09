import java.util.Scanner;

public class A_BuyingSweets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();
        int ans = (x-a)%b;
        System.out.println(ans);
    }
}
