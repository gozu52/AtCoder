import java.util.*;

public class A_ExactPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        sc.close();
        if(x%100==0 && x!=0)System.out.println("Yes");
        else System.out.println("No");
    }
}
