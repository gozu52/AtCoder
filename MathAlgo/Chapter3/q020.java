package MathAlgo.Chapter3;

import java.util.Scanner;

public class q020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        sc.close();
        System.out.println(fiveCards(n, a));
    }
    public static int fiveCards(int n, int[] a){
        int cnt = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    for(int l=k+1;l<n;l++){
                        for(int m=l+1;m<n;m++){
                            if(a[i]+a[j]+a[k]+a[l]+a[m]==1000)cnt++;
                        }
                    }
                }
            }
        }
        return cnt;
    }
}
