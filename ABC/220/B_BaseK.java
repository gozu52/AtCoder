import java.util.*;

public class B_BaseK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = Integer.parseInt(sc.next());
        String a = sc.next();
        String b = sc.next();
        sc.close();
        long ch_a = Integer.parseInt(a,k);
        long ch_b = Integer.parseInt(b,k);
        System.out.println(ch_a*ch_b);
    }
}
