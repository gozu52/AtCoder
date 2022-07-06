import java.util.*;

public class B_Batters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        sc.close();
        long p = 0;
        for(int i=0;i<n;i++){
            long tmp = 0;
            for(int j=i;j<n;j++){
                if(tmp + a[j] > 3){
                    p++;
                    break;
                }else{
                    tmp += a[j];
                }
            }
        }
        System.out.println(p);
    }
}
