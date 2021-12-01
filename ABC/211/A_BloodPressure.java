import java.util.Scanner;

public class A_BloodPressure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        double c = (a-b)/3 + b;

        System.out.println(c);
    }
}
