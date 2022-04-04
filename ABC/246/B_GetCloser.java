import java.util.Scanner;

public class B_GetCloser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        double ran = Math.sqrt(a * a + b * b);
        double per = 1/ran;
        System.out.println((a*per)+" "+(b*per));
    }
}
