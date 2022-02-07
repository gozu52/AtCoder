import java.util.Scanner;

public class C_digitnum{
  static long mod = 998244353;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    sc.close();
    long ans = calc(n);
    System.out.println(ans);
  }
  static long calc(long n){
    long len = String.valueOf(n).length();
    if(len==1)return n*(n+1)/2;
    long x = (long)Math.pow(10, len-1);
    long sum = ((n-x+1)%mod) * ((n-x+2)%mod)/2;
    long ans = (sum + calc(x-1))%mod;
    return ans;
  }
}
