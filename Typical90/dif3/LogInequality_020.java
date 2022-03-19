import java.util.Scanner;

public class LogInequality_020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong(), c = sc.nextLong();
        sc.close();
        long numC = 1;
        for(int i=0;i<b;i++)numC *= c;
        if(a<numC)System.out.println("Yes");
        else System.out.println("No");
    }
}
