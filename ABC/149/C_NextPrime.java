import java.util.Scanner;

public class C_NextPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        sc.close();
        while(true){
            if(isPrime(x)){System.out.println(x);return;}
            x++;
        }
    }
    static boolean isPrime(int x){
        for(int i=2;i*i<=x;i++){
            if(x%i==0)return false;
        }
        return true;
    }
}
