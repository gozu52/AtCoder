import java.util.Scanner;

public class A_106 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        sc.close();
        long x = 1l;
        for(int i=1;i<=37;i++){
            x *= 3;
            long y = 1l;
            for(int j=1;j<=25;j++){
                y *= 5;
                if(x+y==n){
                    System.out.println(i+" "+j);
                    return;
                }
            }
        }
        System.out.println(-1);
    }
}
