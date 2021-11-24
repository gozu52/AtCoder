import java.util.Arrays;
import java.util.Scanner;

public class B_BitterAlchemy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] m = new int[n];
        for(int i=0;i<n;i++){
            m[i]=Integer.parseInt(sc.next());
        }
        sc.close();
        Arrays.sort(m);
        for(int i=0;i<n;i++){
            x-=m[i];
        }
        int ans =m.length+(x/m[0]);
        System.out.println(ans);
    }
}
