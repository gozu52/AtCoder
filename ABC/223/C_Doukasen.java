import java.util.Scanner;

public class C_Doukasen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Double[] a = new Double[n];
        Double[] b = new Double[n];
        double t =0, ans= 0;
        for(int i=0;i<n;i++){
            a[i] = Double.parseDouble(sc.next());
            b[i] = Double.parseDouble(sc.next());
            t += a[i]/b[i];
        }
        sc.close();
        t/=2;
        for(int i=0;i<n;i++){
            ans += Math.min(a[i], t*b[i]);
            t-= Math.min(a[i]/b[i],t);
        }
        System.out.println(ans);
    }
}