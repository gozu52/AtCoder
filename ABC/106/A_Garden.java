import java.util.Scanner;

public class A_Garden {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        System.out.println(a*b-(a+b)+1);
    }
}
