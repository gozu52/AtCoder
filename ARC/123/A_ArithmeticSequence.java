import java.util.Scanner;

public class A_ArithmeticSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a1 = Long.parseLong(sc.next());
        long a2 = Long.parseLong(sc.next());
        long a3 = Long.parseLong(sc.next());
        sc.close();
        long cnt =a1+a3-(2*a2);
        if(cnt>0){
            if(cnt%2==0)System.out.println(cnt/2);
            else System.out.println((cnt+1)/2 +1);
        }else System.out.println(-cnt);
    }
}
