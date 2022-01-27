import java.util.Scanner;

public class C_MandarinOrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i]=Integer.parseInt(sc.next());
        sc.close();
        int x = 0;
        for(int i=0;i<n;i++){
            int min = a[i];
            for(int j=i;j<n;j++){
                min = Math.min(min, a[j]);
                x = Math.max(x, min*(j-i+1));
            }
        }
        System.out.println(x);
    }
}
