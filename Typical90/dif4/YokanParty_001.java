import java.util.*;

public class YokanParty_001 {
    //解説AC
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n+1];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        sc.close();
        a[n] = l;
        int p = 1, q = l+1;
        while(q-p>1){
            int mid = (p+q)/2;
            if(check(a, n, k, mid)){
                p = mid;
            }else{
                q = mid;
            }
        }
        System.out.println(p);
    }
    static boolean check(int[] a, int n, int k, int mid){
        int pre = 0, cnt =0;
        for(int i=0;i<=n;i++){
            if(a[i]-pre>=mid){pre=a[i];cnt++;}
        }
        return k<cnt;
    }
}
