import java.util.*;

public class A_DigitSum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = String.valueOf(sc.nextLong()+1);
        sc.close();
        long ans = Long.parseLong(n.substring(0, 1))-1 + 9*(n.length()-1);
        System.out.println(ans);
    }
}