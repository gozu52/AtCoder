import java.util.*;

public class B_GoldenApple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), d = sc.nextInt();
        sc.close();
        boolean flag = (n % (d*2+1) == 0);
        if(flag)System.out.println(n / (d*2+1));
        else System.out.println(n / (d*2+1) + 1);
    }
}
