import java.util.HashSet;
import java.util.Scanner;
import java.awt.Point;

public class D_Rectangles2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] xy  = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                xy[i][j]=Integer.parseInt(sc.next());
            }
        }
        sc.close();
        HashSet<Point> coordinate = new HashSet<>();
        Point[] p_arr = new Point[n];
        for(int i=0;i<n;i++){
            Point pt= new Point(xy[i][0],xy[i][1]);
            p_arr[i]=pt;
            coordinate.add(pt);
        }
        int cnt =0;
        for(Point pt1: p_arr){
            for(Point pt2: p_arr){
                if(pt1.x<pt2.x && pt1.y<pt2.y){
                    boolean leftUp = coordinate.contains(new Point(pt1.x,pt2.y));
                    boolean rightDown = coordinate.contains(new Point(pt2.x,pt1.y));
                    if(leftUp && rightDown)cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
