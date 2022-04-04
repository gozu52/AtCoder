import java.util.Scanner;

public class D_2variableFunction {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        long num = 1000000;
        long ans = Long.MAX_VALUE;
        for(long i=0;i<1000000;i++){
            while(f(i,num)>=n && num>=0){
                ans = Math.min(ans, f(i,num));
                num--;
            }
        }
        System.out.println(ans);
    }
    static long f(long a,long b){
        return (a*a*a)+(a*a*b)+(a*b*b)+(b*b*b);
    }
}
