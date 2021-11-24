import java.util.Scanner;

public class A_Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();
        int cnt =0;
        for(int i=a;i<=b;i++)cnt++;
        System.out.println(cnt);
    }
}