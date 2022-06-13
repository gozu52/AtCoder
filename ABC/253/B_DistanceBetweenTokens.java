import java.util.*;

public class B_DistanceBetweenTokens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        char[][] map = new char[h][w];
        for(int i=0; i<h; i++) {
            map[i] = sc.next().toCharArray();
        }
        sc.close();
        int sx = -1, sy = -1, ex = -1, ey = -1;
        for(int i=0;i<h;i++){
            for(int j=0;j<w;j++){
                if(map[i][j]=='o' && sx!=-1){
                    ex = i;
                    ey = j;
                }
                if(map[i][j]=='o' && sx==-1){
                    sx = i;
                    sy = j;
                }
            }
        }
        System.out.println(Math.abs(sx-ex)+Math.abs(sy-ey));
    }
}
