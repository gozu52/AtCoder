import java.util.*;

public class A_SeismicMagnitudeScales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();
        System.out.println((int)Math.pow(32, a-b));
    }
}
