import java.util.*;

public class B_FailingGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int p = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int cnt =0;
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
            if(a[i]<p)cnt++;
        }
        sc.close();
        System.out.println(cnt);
    }
}
