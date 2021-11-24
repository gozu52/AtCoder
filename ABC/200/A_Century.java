import java.util.Scanner;

public class A_Century {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();
        if(n%100==0)System.out.println(n/100);
        else System.out.println(n/100 +1);
    }
}
