import java.util.*;

public class A_EdgeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        if((a==1 && b==10) || (b-a==1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
