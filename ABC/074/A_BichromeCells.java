import java.util.Scanner;

public class A_BichromeCells {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        sc.close();
        int ans = (n*n)-a;
        System.out.println(ans);
    }
}
