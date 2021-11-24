import java.util.*;

public class A_RoundDecimals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = Double.parseDouble(sc.next());
        sc.close();
        System.out.println(Math.round(x));
    }
}
