package MathAlgo.Chapter3;

import java.util.Scanner;

public class q019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        sc.close();
        System.out.println(combination(n, a));
    }
    public static long combination(int n,int[]a){
        long x = 0, y = 0, z = 0, sum = 0;
        for(int i=0;i<n;i++){
            if(a[i]==1)x++;
            if(a[i]==2)y++;
            if(a[i]==3)z++;
        }
        sum = (x*(x-1))/2 + (y*(y-1))/2 + (z*(z-1))/2;
        return sum;
    }
}
