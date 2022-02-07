import java.util.*;

public class B_Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i]=Integer.parseInt(sc.next());
        sc.close();
        int ans = 0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            ans += a[i];
            if(ans>359)ans -=360;
            arr[i] = ans;
        }
        int cnt = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int tmp = 0;
        for(int i=0;i<n;i++){
            cnt = Math.max(arr[i]-tmp, cnt);
            System.out.println(cnt);
            tmp = arr[i];
        }
        cnt = Math.max(cnt, 360-arr[n-1]);
        System.out.println(cnt);
    }   
}