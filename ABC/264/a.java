import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt()-1, r = sc.nextInt()-1;
        sc.close();
        String a = "atcoder";
        System.out.println(a.substring(l, r+1));
    }
}