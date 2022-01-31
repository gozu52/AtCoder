import java.util.Scanner;

public class A_PlusMinus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();
        int y = (a-b)/2;
        int x = a-y;
        System.out.println(x+" "+y);
    }
}
