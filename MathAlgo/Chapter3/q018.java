package MathAlgo.Chapter3;

import java.util.Scanner;

public class q018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        sc.close();
        System.out.println(pay500(n, a));
    }
    public static long pay500(int n, int[] a){
        long cnt=0,cnt100=0,cnt200=0,cnt300=0,cnt400=0;
        for(int i=0;i<n;i++){
            if(a[i]==100)cnt100++;
            if(a[i]==200)cnt200++;
            if(a[i]==300)cnt300++;
            if(a[i]==400)cnt400++;
        }
        cnt = (cnt100*cnt400)+(cnt200*cnt300);
        return cnt;
    }
}
