import java.util.*;

public class C_Collision2 {	
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
        Map<Integer, Rng> map = new HashMap<>();
        for(int i=0;i<n;i++){
            Rng rng;
            if(map.containsKey(xy[i][1]))rng = map.get(xy[i][1]);
            else rng = new Rng();
            if(s.charAt(i)=='L')rng.l = Math.max(rng.l, xy[i][0]);
            else rng.r = Math.min(rng.r, xy[i][0]);
            if(rng.r<rng.l){
                System.out.println("Yes");
                return;
            }
            map.put(xy[i][1], rng);
        }
        System.out.println("No");
    }
    static class Rng{
        int r = Integer.MAX_VALUE, l = Integer.MIN_VALUE;
    }
}
