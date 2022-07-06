import java.util.*;

public class A_AtoZString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt();
        sc.close();
        if(x%n==0)System.out.println((char)(x/n+64));
        else System.out.println((char)(x/n+1+64));
    }
}