import java.util.*;

public class D_RangeCountQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=1;i<=n;i++)map.put(i, new ArrayList<>());
        for(int i=0;i<n;i++)map.get(sc.nextInt()).add(i);
        int q = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while(q-->0){
            int l = sc.nextInt(), r = sc.nextInt(), x = sc.nextInt();
            int g = ~Collections.binarySearch(map.get(x), r-1, (a,b)-> a.compareTo(b)>0?1:-1)-1;
            int s = ~Collections.binarySearch(map.get(x), l-1, (a,b)-> a.compareTo(b)>=0?1:-1)-1;
            System.out.println(g+" "+s);
            sb.append((g-s)+"\n");
        }
        sc.close();
        System.out.println(sb);
    }
}
