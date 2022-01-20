package MathAlgo.Chapter2;

import java.util.*;

public class q002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        for(int i=0;i<3;i++)ans += sc.nextInt();
        sc.close();
        System.out.println(ans);
    }
}
