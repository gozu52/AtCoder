import java.util.Arrays;
import java.util.Scanner;

public class B_DoYouKnowTheSecondHighestMountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        int t[] = new int[n];
        for(int i=0;i<n;i++){
            s[i] = sc.next();
            t[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int[] tmpT = t.clone();
        Arrays.sort(tmpT);
        for(int i=0;i<n;i++){
            if(tmpT[n-2]==t[i]){
                System.out.println(s[i]);
            }
        }
    }
}