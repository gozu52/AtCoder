package MathAlgo.Chapter3;

import java.util.*;

public class q028 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] h = new int[n];
        for(int i=0;i<n;i++)h[i] = sc.nextInt();
        sc.close();
        int[] frog = new int[n];
        frog[0] = 0; frog[1] = (int)Math.abs(h[0]-h[1]);
        for(int i=2;i<n;i++){
            frog[i] = Math.min(frog[i-1]+(int)Math.abs(h[i-1]-h[i]), frog[i-2]+(int)Math.abs(h[i-2]-h[i]));
        }
        System.out.println(frog[n-1]);
    }
}
