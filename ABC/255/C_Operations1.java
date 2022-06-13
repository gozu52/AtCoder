import java.util.*;

public class C_Operations1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong(), a = sc.nextLong(), d = sc.nextInt(), n = sc.nextLong();
        sc.close();
        if(d==0){
            System.out.println(Math.abs(x-a));
            return;
        }else if(d<0){
            long tmp = (n-1)*d +a;
            a = tmp;
            d *= -1;
        }
        long maxVal = (n-1)*d +a;
        if(a<=x && x<=maxVal){
            long ans = Math.min((x-a)%d, d-(x-a)%d);
            System.out.println(ans);
        }else if(x<a){
            System.out.println(a-x);
        }else{
            System.out.println(x-maxVal);
        }    
    }
}
