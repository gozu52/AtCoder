import java.util.*;

public class A_10yenStamp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        sc.close();
        int ans =0;
        while(y-x>0){
            ans++;x+=10;
        }
        System.out.println(ans);
    }
}