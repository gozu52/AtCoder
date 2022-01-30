import java.util.*;

public class A_NotOverflow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        sc.close();
        long max = Integer.MAX_VALUE;
        long min = Integer.MIN_VALUE;
        if(n<=max && n>=min){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
