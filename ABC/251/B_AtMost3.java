import java.util.*;

public class B_AtMost3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), w = sc.nextInt();
        int[] a = new int[n+2];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        sc.close();
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<n+2;i++){
            for(int j=0;j<n+2;j++){
                for(int k=0;k<n+2;k++){
                    if(i==j||j==k||i==k)continue;
                    int tmp = a[i]+a[j]+a[k];
                    if(tmp<=w)set.add(tmp);
                }
            }
        }
        System.out.println(set.size());
    }
}
