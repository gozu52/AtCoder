package ABC.q300.ABC255;

import java.util.*;

public class A_YouShouldOutputARCThoroughThisIsABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt()-1, c = sc.nextInt()-1;
        int[][] a = new int[2][2];
        for(int i=0;i<2;i++)for(int j=0;j<2;j++)a[i][j] = sc.nextInt();
        sc.close();
        System.out.println(a[r][c]);
    }
}