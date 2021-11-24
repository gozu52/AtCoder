import java.util.Scanner;

public class A_SumandProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = Long.parseLong(sc.next());
        long p = Long.parseLong(sc.next());
        sc.close();

        int p_sqrt = (int)Math.sqrt(p);
        for(int n=1;n<=p_sqrt;++n){
            if(s-n<0)break;
            else if(n*(s-n)==p){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
