import java.util.*;

public class A_Jogging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int f = sc.nextInt();
        int x = sc.nextInt();
        sc.close();
        int takahasi = 0;
        int aoki = 0;
        if(x%(a+c)==0){
            takahasi += x/(a+c) * a * b;
        }else{
            takahasi += x/(a+c) * a * b;
            if(x%(a+c)>=a){
                takahasi += a * b;
            }else{
                takahasi += x%(a+c) * b;
            }
        }
        if(x%(d+f)==0){
            aoki += x/(d+f) * d * e;
        }else{
            aoki += x/(d+f) * d * e;
            if(x%(d+f)>=d){
                aoki += d * e;
            }else{
                aoki += x%(d+f) * e;
            }
        }
        if(takahasi==aoki){
            System.out.println("Draw");
        }else if(takahasi>aoki){
            System.out.println("Takahashi");
        }else{
            System.out.println("Aoki");
        }
    }
}
