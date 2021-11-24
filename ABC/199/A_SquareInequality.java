import java.util.*;

public class A_SquareInequality {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        sc.close();
        if(a*a+b*b <c*c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }   
}
