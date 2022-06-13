import java.util.*;

public class A_LastTwoDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();
        System.out.println(String.valueOf(n.charAt(n.length()-2)) + String.valueOf(n.charAt(n.length()-1)));
    }
}
