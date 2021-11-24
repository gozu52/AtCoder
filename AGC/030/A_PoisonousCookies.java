import java.util.Scanner;

public class A_PoisonousCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next()),b = Integer.parseInt(sc.next()),c = Integer.parseInt(sc.next());
        sc.close();
        int ans = 0;
        if(a+b>=c-1){
            ans += b+c;
        }else{
            ans += a+b+b+1;
        }
        System.out.println(ans);
    }
}
