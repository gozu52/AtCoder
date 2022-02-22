import java.util.*;

public class A_Thumbnail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        double ave = 0;
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            ave += a[i];
        }
        sc.close();
        ave /= n;
        double tmp = Double.MAX_VALUE;
        int ans = 0;
        for(int i=0;i<n;i++){
            if(tmp>Math.abs(a[i]-ave)){
                ans = i;
                tmp = Math.abs(a[i]-ave);
            }
        }
        System.out.println(ans);
    }
}