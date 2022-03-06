import java.util.*;

public class A_Tshirt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        double x = sc.nextInt();
        sc.close();
        if(x<=a){
            System.out.println(1.0);
        }else if(x>a && x<=b){
            System.out.println((double)(c/(b-a)));
        }else{
            System.out.println(0.0);
        }
    }
}
