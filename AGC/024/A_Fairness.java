import java.util.Scanner;

public class A_Fairness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), k = sc.nextLong();
        sc.close();
        if(k%2!=0)System.out.println(b-a);
        else System.out.println(a-b);
    }
}
