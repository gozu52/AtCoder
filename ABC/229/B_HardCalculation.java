import java.util.*;
 
public class B_HardCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        sc.close();
        String ans = "Easy";
        while(a>0&&b>0){
            long tmp = a%10 + b%10;
            if(tmp >=10){
                ans = "Hard";
                break;
            }
            a/=10;
            b/=10;
        }
        System.out.println(ans);
    }
    
}
