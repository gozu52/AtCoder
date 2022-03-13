import java.util.*;

public class CPClasses_007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        Arrays.sort(a);
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<q;i++){
            int b = sc.nextInt();
            int ans = 0, l =0, r = n-1;
            while(l<r){
                int mid = (l+r)/2;
                if(a[mid]<b) l = mid+1;
                else r = mid;
            }
            if(r==0){
                ans = Math.abs(a[r]-b);
            }else{
                ans = Math.min(Math.abs(a[r-1]-b), Math.abs(a[r]-b));
            }
            sb.append(ans+"\n");
        }
        sc.close();
        System.out.println(sb);
    }
}
