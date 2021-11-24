import java.util.*;

public class C_Doukasen2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        double[] a = new double[n];
        double[] b = new double[n];
        //Array for elapsed time
        double[] t = new double[n];
        //Half sum of elapsed time
        double halfTime =0,ans =0;
        for(int i=0;i<n;i++){
            a[i] = Double.parseDouble(sc.next());
            b[i] = Double.parseDouble(sc.next());
            t[i] = a[i]/b[i];
            halfTime += t[i];
        }
        halfTime /= 2;
        sc.close();

        for(int i=0;i<n;i++){
            if(halfTime -t[i]>0){
                ans += a[i];
                halfTime -= t[i];
            }else{
                ans += b[i]*halfTime;
                halfTime = 0;
            }
        }
        System.out.println(ans);
    }
}
