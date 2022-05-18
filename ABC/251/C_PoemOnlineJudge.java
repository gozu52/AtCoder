import java.util.*;

public class C_PoemOnlineJudge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<String, Integer> map = new TreeMap<>();
        String[][] q = new String[n][2];
        int cnt = 0;
        while(n-->0){
            String s = sc.next();
            int t = sc.nextInt();
            map.putIfAbsent(s, t);
            q[cnt][0] = s;
            q[cnt][1] = ""+t;
            cnt++;
        }
        sc.close();
        Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);
        int ansnum = 0; String ansstr = "";
        for(Map.Entry<String, Integer> e : map.entrySet()){
            int tmp = e.getValue();
            if(tmp>ansnum){
                ansnum = tmp;
                ansstr = e.getKey();
            }
        }
        for(int i=0;i<q.length;i++){
            if(q[i][0].equals(ansstr)){
                System.out.println(i+1);
                return;
            }
        }
    }
}
