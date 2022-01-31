import java.util.*;

public class B_MatrixTransposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int[][] hw = new int[h][w];
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                hw[i][j] = Integer.parseInt(sc.next());
            }
        }
        sc.close();
        for(int i=0;i<w;i++){
            for(int j=0;j<h;j++){
                System.out.print(hw[j][i]+" ");
            }
            System.out.println();
        }
    }
}
