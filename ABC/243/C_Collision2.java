import java.util.*;
import java.awt.*;

public class C_Collision2 {
    //解説AC
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] xy = new int[n][2];
        for(int i=0;i<n;i++){
            xy[i][0] = sc.nextInt();
            xy[i][1] = sc.nextInt();
        }
        String s = sc.next();
        sc.close();
        Point p = new Point(-1,Integer.MAX_VALUE);
        Map<Integer, Point> map = new HashMap<>();
        for(int i=0;i<n;i++){
            Point pt;
            if(map.containsKey(xy[i][1]))pt = map.get(xy[i][1]);
            else pt = p;
            if(s.charAt(i)=='L')pt.x = Math.max(pt.x, xy[i][0]);
            else pt.y = Math.min(pt.y, xy[i][0]);
            if(pt.y<pt.x){
                System.out.println("Yes");
                return;
            }
            map.put(xy[i][1], pt);
        }
        System.out.println("No");
    }
}
