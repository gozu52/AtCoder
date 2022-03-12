import java.util.*;

public class CrossSum_004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        int[][] masu = new int[h+1][w+1];
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<h;i++){
            int sumW = 0;
            for(int j=0;j<w;j++){
                masu[i][j] = sc.nextInt();
                sumW += masu[i][j];
            }
            masu[i][w]=sumW;
        }
        sc.close();
        for(int i=0;i<w;i++){
            int sumH =0;
            for(int j=0;j<h;j++)sumH += masu[j][i];
            masu[h][i] = sumH;
        }
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                sb.append((masu[h][j]+masu[i][w]-masu[i][j])+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
