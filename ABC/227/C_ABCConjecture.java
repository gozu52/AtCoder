import java.util.*;

public class C_ABCConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());
        sc.close();
        long cnt =0;
        for(long i=1;i*i*i<=n;i++){
            for(long j=i;i*j*j<=n;j++){
                // n/(i+j)==max_C
                //-j+1 j<=x<=max_c
                cnt += n/(i*j)-j+1;
            }
        }
        System.out.println(cnt);
    }
}
