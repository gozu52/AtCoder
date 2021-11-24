import java.util.*;

public class A_Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String[] tmp = s.split("");
        String ans = tmp[1] + tmp[2] + tmp[0];
        System.out.println(ans);
    }
}
