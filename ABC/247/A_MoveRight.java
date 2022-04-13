import java.util.*;

public class A_MoveRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String ans = "0";
        for(int i=1;i<4;i++){
            if(s.charAt(i-1)=='1'){
                ans += "1";
            }else ans+= "0";
        }
        System.out.println(ans);
    }
}
