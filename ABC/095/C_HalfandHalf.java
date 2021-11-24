import java.util.Scanner;

public class C_HalfandHalf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        sc.close();
        int max_xy = Math.max(x, y);
        long ans = (a*x)+(b*y);
        for(int i=max_xy;i>=0;i--){
            int tmp_x = zeroCheck(x-i);
            int tmp_y = zeroCheck(y-i);
            long tmp = i*c*2 + (tmp_x*a)+(tmp_y*b);
            ans = Math.min(ans,tmp);
        }
        System.out.println(ans);
    }
    public static int zeroCheck(int num){
        if(num<0)num=0;
        return num;
    }
}
