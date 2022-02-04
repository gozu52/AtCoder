import java.util.Scanner;

public class C_CompassWalking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        sc.close();

        double ans = 0;
        ans = Math.pow(x, 2)+Math.pow(y, 2);
        ans =Math.sqrt(ans);
        if(r>ans){
            System.out.println(2);
        }else{
        ans =ans/r;
                
        System.out.println((int)Math.ceil(ans));
        }
    }
}
