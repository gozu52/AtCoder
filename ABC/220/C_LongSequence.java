import java.util.*;

public class C_LongSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] a = new long[n];
        long a_sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Long.parseLong(sc.next());
            a_sum += a[i];
        }
        long x = Long.parseLong(sc.next());
        sc.close();
        long count = (x/a_sum)*n;
        x = x%a_sum;
        long zero_a = 0;
        for(int i=0;i<n;i++){
            zero_a += a[i];
            count++;
            if(zero_a>x){
                System.out.println(count);
                break;
            }
        }
    }
}
