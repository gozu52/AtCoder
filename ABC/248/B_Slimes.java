import java.util.*;

public class B_Slimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt(), b = sc.nextInt(), k = sc.nextInt();
        sc.close();
        int cnt = 0;
        while(a<b){
            a *= k;
            cnt++;
        }
        System.out.println(cnt);
    }
}
