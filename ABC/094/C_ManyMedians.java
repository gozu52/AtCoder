import java.util.*;

public class C_ManyMedians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] x = new int[n];
        for(int i=0;i<n;i++)x[i] = Integer.parseInt(sc.next());
        int[] compare = x.clone();
        Arrays.sort(compare);
        sc.close();
        int center = compare[(n / 2 - 1)];
        for(int i=0;i<n;i++){
            if(x[i]<=center){
                System.out.println(compare[(n/2)]);
            }else{
                System.out.println(compare[(n/2 -1)]);
            }
        }
    }
}
