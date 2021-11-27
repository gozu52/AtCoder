import java.util.Scanner;

public class A_DistributeCandy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();
        if(a%b!=0){
            System.out.println(b-(a%b));
        }else System.out.println(0);
    }
}
