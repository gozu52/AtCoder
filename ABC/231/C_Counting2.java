import java.util.*;

public class C_Counting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        int[] tmpa = a.clone();
        Arrays.sort(tmpa);        
        for(int i=0;i<q;i++){
            int l = 0, r = n-1;
            int x = Integer.parseInt(sc.next());
            int ans =0;
            if(x>tmpa[r]){
                System.out.println(0);
            }else if(x<=tmpa[l]){
                System.out.println(n);
            }else{
                while(r-l>1){
                    int mid = ((l+r)/2);
                    if(x<=tmpa[mid])r=mid;
                    if(x>tmpa[mid])l=mid;
                }
                ans = n-l-1;
                System.out.println(ans);
            }
        }  
        sc.close();
    }
}
