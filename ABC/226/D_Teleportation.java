import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D_Teleportation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] x = new int[n];
        int[] y = new int[n];
        for(int i=0;i<n;i++){
            x[i] = Integer.parseInt(sc.next());
            y[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        Set<String>  magics = new HashSet<>();

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int difX = x[j] - x[i];
                int difY = y[j] - y[i];
                //
                if(difX<0){
                    difX = -difX;
                    difY = -difY;
                }
                //
                if(difX==0){
                    magics.add("0 1");
                }else if(difY==0){
                    magics.add("1 0");
                }else{
                    int gcd = gcd(difX,Math.abs(difY));
                    difX /= gcd;
                    difY /= gcd;
                    magics.add(difX+""+difY);
                }
            }
        }
        System.out.println(magics.size()*2);
        System.out.println();
        System.out.println(magics);


    }
    public static int gcd(int x, int y){
        if(x<y)return gcd(y,x);
        if(y==0)return x;
        return gcd(y,x%y);
    }
}