import java.util.*;

public class D_ProjectPlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        long[] a = new long[n];
        for(int i=0;i<n;i++){
            a[i] = Long.parseLong(sc.next());
        }
        sc.close();

        //binary search for monotonous changes
        //right is a large value that doesn't overflow and doesn't affect

        long right = Long.MAX_VALUE/k;
        long left = 0;

        while(right-left>1){
            long p = (right+left)/2;
            long sum = 0;
            for(int i=0;i<n;i++){
                sum += Math.min(a[i], p);
            }
            if(sum>=k*p){
                left = p;
            }else{
                right = p;
            }
        }
        System.out.println(left);
    }
}
