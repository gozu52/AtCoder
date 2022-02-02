import java.util.Scanner;

public class A_Hands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt();
        sc.close();
        if(a>b)a--;
        int upCnt = Math.abs(a-b);
        int ans =0;
        ans = (Math.min(2*x,y) * upCnt)+x;
        System.out.println(ans);
    }
}
