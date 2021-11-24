import java.util.Arrays;
import java.util.Scanner;

public class B_TakahashiSecret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next())-1;
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.next())-1;
        }
        sc.close();
        int ans = 0;
        boolean[] check = new boolean[n];
        Arrays.fill(check, false);
        while(!check[x]){
            ans++;
            check[x]=true;
            x=a[x];
        }
        System.out.println(ans);
    }
}