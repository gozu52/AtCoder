import java.util.*;

public class A_GrowthRecord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt(), x = sc.nextInt(), t = sc.nextInt(), d = sc.nextInt();
        sc.close();
        if(n>=x){
            if(m>=x){
                System.out.println(t);
                return;
            }else{
                System.out.println(t-(x-m)*d);
            }
        }else{
            System.out.println(t-(n-m)*d);
        }
    }
}
