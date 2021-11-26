import java.util.Scanner;

public class A_Takoyaki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();
        int ans1 = (n%10)*15;
        int ans10 = (n/10)*100;
        if(n%10<7)System.out.println(ans1+ans10);
        else System.out.println(ans10+100);
    }
}
