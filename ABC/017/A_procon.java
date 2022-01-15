import java.util.*;

public class A_procon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s1 = Integer.parseInt(sc.next()) * ((Integer.parseInt(sc.next()))*0.1);
        double s2 = Integer.parseInt(sc.next()) * ((Integer.parseInt(sc.next()))*0.1);
        double s3 = Integer.parseInt(sc.next()) * ((Integer.parseInt(sc.next()))*0.1);
        sc.close();
        System.out.println((int)Math.round(s1+s2+s3));
    }
}