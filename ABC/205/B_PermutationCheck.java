import java.util.Scanner;

public class B_PermutationCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        for(int i=1;i<=n;i++){
            int cnt = 0;
            for(int j=0;j<n;j++){
                if(a[j]==i)cnt++;
            }
            if(cnt!=1){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
