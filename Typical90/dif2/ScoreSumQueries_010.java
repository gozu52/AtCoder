import java.util.*;

public class ScoreSumQueries_010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, Integer> mapa = new HashMap<>();
        Map<Integer, Integer> mapb = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int numa = 0 , numb = 0;
        mapa.put(0, numa);mapb.put(0, numb);
        for(int i=1;i<=n;i++){
            int c = sc.nextInt();
            if(c==1)numa += sc.nextInt();
            else numb += sc.nextInt();
            mapa.put(i, numa);mapb.put(i, numb);
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int l = sc.nextInt(); int r = sc.nextInt();
            sb.append((mapa.get(r)-mapa.get(l-1))+" "+(mapb.get(r)-mapb.get(l-1))+"\n");
        }
        sc.close();
        System.out.println(sb);
    }
}
