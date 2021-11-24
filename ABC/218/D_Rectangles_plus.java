import java.util.HashSet;
import java.util.Scanner;
import java.awt.Point;

public class D_Rectangles_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] points = new int[n][2];
        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                points[i][j] = Integer.parseInt(sc.next());
            }
        }
        sc.close();
        //入力終了
        //処理開始
        /*
        hashset にポイント型でx,y座標を入れる
        Point配列に順番通りにintで受け取った配列を入れる
        ->Point配列は一つの値として座標を持てる
        */
        HashSet<Point> coordinates = new HashSet<>();
        Point[] p_arr = new Point[n];
        for(int i=0;i<n;i++){
            Point pt = new Point(points[i][0],points[i][1]);
            coordinates.add(pt);
            p_arr[i]=pt;
        }

        int cnt = 0;
        /*
        Point配列を2回繰り返す中で、設定されたP1よりP2の両方の値が大きければ、
        P1＝左下、P2＝右上になる
        そのとき、HashSetのなかに右下、左上に値するものがあれば、長方形の数数える
        */
        for(Point p1 :p_arr){
            for(Point p2:p_arr){
                if(p1.x < p2.x && p1.y < p2.y){
                    boolean upLeft_points = coordinates.contains(new Point(p2.x,p1.y));
                    boolean downRight_points = coordinates.contains(new Point(p1.x,p2.y));
                    if(upLeft_points && downRight_points)cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
