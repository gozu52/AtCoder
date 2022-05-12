import java.util.*;

public class A_AdjacentSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        int r = sc.nextInt(), c = sc.nextInt();
        sc.close();
        int cnt =0 ;
        if(r+1<=h)cnt++;
        if(r-1>=1)cnt++;
        if(c+1<=w)cnt++;
        if(c-1>=1)cnt++;
        System.out.println(cnt);
    }
}
