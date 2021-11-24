import java.io.*;
import java.util.*;

public class D_8PuzzleOnGraph {

    static Scanner sc;
    static PrintWriter out;
    //Separate main and processing
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        out = new PrintWriter(System.out);
        new D_8PuzzleOnGraph().solve();
        out.flush();
    }
    public void solve() {
        int m = sc.nextInt();
        //graph which node is connecting
        boolean[][] g = new boolean[9][9];
        for(int i=0; i<m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            g[a][b] = g[b][a] = true;
        }
        char[] p = new char[9];
        Arrays.fill(p, '8');
        //Indicate what number s are in the order
        //if the number is 8, it is show the box was enpty
        for(int i=0; i<8; i++) {
            int a = sc.nextInt()-1;
            p[a] = (char)('0' + i);
        }
        System.out.println(Arrays.toString(p));
        Map<String, Integer> map = new HashMap<>();
        Queue<String> q = new LinkedList<>();
        q.add(new String(p));
        map.put(new String(p), 0);

        System.out.println(map);
        System.out.println(q);
        //System.out.println("ok"+q.poll());
        //820345671

        while(!q.isEmpty()) {
            //poll
            String ok = q.poll();
            
            int d = map.get(ok);
            if(ok.equals("012345678")) {
                out.println(d);
                return;
            }
            char[] pp = ok.toCharArray();
            int pos = -1;
            for(int i=0; i<9; i++) {
                if(pp[i] == '8') {
                    pos = i;
                    break;
                }
            }
            for(int i=0; i<9; i++) {
                if(g[pos][i]) {
                    //System.out.println("pos1 "+pp[pos]);
                    pp[pos] = pp[i];
                    //System.out.println("pos2 "+pp[pos]);
                    //System.out.println("pp0 "+pp[i]);
                    pp[i] = '8';
                    //System.out.println("pp "+pp[i]);
                    String key = new String(pp);
                    //System.out.println("key"+key);
                    if(!map.containsKey(key)) {
                        map.put(key, d+1);
                        q.offer(key);
                    }
                    pp[i] = pp[pos];
                    //System.out.println("pos3 "+key);
                    pp[pos] = '8';
                    //System.out.println("pp2 "+pp[pos]);
                    //System.out.println(Arrays.deepToString(g));
                    
                }
            }
        }
        out.println(-1);
    }
}
