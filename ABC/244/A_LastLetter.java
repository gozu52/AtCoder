import java.util.*;

public class A_LastLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        System.out.println(s.charAt(n-1));
    }
}
