import java.util.Scanner;

public class B_Hydrate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int d = Integer.parseInt(sc.next());
        sc.close();
        int ans =-1;
        if(c*d-b>0)ans = (int)Math.ceil((double)a / (c*d-b));
        System.out.println(ans);
    }
}
