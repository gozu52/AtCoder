import java.util.*;

public class C_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] xy = new int[n][2];
        for(int i=0;i<n;i++){
            xy[i][0] = Integer.parseInt(sc.next());
            xy[i][1] = Integer.parseInt(sc.next());
        }
        sc.close();
        int cnt = ((n*(n-1)*(n-2)) / 6 );
        int minus = countMinus(xy);
        System.out.println(cnt-minus);

    }
    public static int countMinus(int[][]xy){
        int c = 0;
        for(int i=0;i<xy.length;i++){
            for(int j=i+1;j<xy.length;j++){
                for(int k=j+1;k<xy.length;k++){
                    if(j==k)continue;
                    int tmpJx = xy[j][0] - xy[i][0], tmpJy = xy[j][1] - xy[i][1];
                    int tmpKx = xy[k][0] - xy[i][0], tmpKy = xy[k][1] - xy[i][1];
                    if(Math.abs((tmpJx*tmpKy)-(tmpKx*tmpJy))==0){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}