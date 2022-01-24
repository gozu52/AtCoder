import java.util.*;

public class A_chukodai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = Integer.parseInt(sc.next())-1;
        int b = Integer.parseInt(sc.next())-1;
        sc.close();
        char tmp1 = s.charAt(a);
        char tmp2 = s.charAt(b);
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.replace(a, a+1, String.valueOf(tmp2));
        sb.replace(b, b+1, String.valueOf(tmp1));
        System.out.println(sb);
    }
}
