import java.util.Arrays;
import java.util.Scanner;

public class B_BoodyPrize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int[] b = a.clone();
        Arrays.sort(a);
        for(int i=0;i<n;i++){
            if(b[i]==a[a.length-2]){
                System.out.println(i+1);
            }
        }
    }
}
