import java.util.*;

public class D_IndexTrio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[200001];
        for(int i=0;i<n;i++)a[sc.nextInt()] +=1;
        sc.close();
        long ans = 0;
        for(int i=1;i<200001;i++){
            for(int j=1;j*i<200001;j++){
                ans += (long)a[i]*a[j]*a[i*j];
            }
        }
        System.out.println(ans);
    }
}
