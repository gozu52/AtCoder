import java.util.*;

public class A_ExponentialorQuadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Integer.parseInt(sc.next());
        sc.close();
        if(Math.pow(2, n)>Math.pow(n, 2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
