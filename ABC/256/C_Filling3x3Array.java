import java.util.*;

public class C_Filling3x3Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] h = new int[3];
        int[] w = new int[3];
        for(int i=0;i<3;i++)h[i] = sc.nextInt();
        for(int i=0;i<3;i++)w[i] = sc.nextInt();
        sc.close();
        long cnt = 0;
        for(int i=1;i<=28;i++){
            for(int j=1;j<=28;j++){
                for(int k=1;k<=28;k++){
                    for(int l=1;l<=28;l++){
                        boolean w0 = w[0]-i-k>0;
                        boolean w1 = w[1]-j-l>0;
                        boolean w2 = w[2]-(h[0]-i-j)-(h[1]-k-l)>0;
                        boolean h0 = h[0]-i-j>0;
                        boolean h1 = h[1]-k-l>0;
                        boolean h2 = h[2]-(w[0]-i-k)-(w[1]-j-l)>0;
                        boolean check = w[2]-(h[0]-i-j)-(h[1]-k-l)==h[2]-(w[0]-i-k)-(w[1]-j-l);
                        if(w0 && w1 && w2 && h0 && h1 && h2 && check)cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
