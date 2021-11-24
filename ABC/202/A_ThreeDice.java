import java.util.Scanner;

public class A_ThreeDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 7 - Integer.parseInt(sc.next());
        int b = 7 - Integer.parseInt(sc.next());
        int c = 7 - Integer.parseInt(sc.next());
        sc.close();
        System.out.println(a+b+c);
    }
}
