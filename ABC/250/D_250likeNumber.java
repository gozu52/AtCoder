import java.util.*;

public class D_250likeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<1000000L;i++)if(isPrime(i))list.add(i);
        long cnt = 0;
        for(int i=0;i<list.size();i++){
            long num = list.get(i);
            for(int j=i+1;j<list.size();j++){
                long num2 = list.get(j);
                if(n/num>=num2*num2*num2)cnt++;
                else break;
            }
        }
        System.out.println(cnt);
    }
    static boolean isPrime(int num){
        if(num<2)return false;
        for(int i=2;i*i<=num;i++)if(num%i==0)return false;
        return true;
    }
}
