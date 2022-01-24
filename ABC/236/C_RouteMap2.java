import java.util.*;

public class C_RouteMap2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Map<String,Boolean> map = new LinkedHashMap<>();
        for(int i=0;i<n;i++)map.put(sc.next(), false);
        for(int i=0;i<m;i++)map.put(sc.next(),true);
        sc.close();
        map.forEach((k,v) -> System.out.println(v?"Yes":"No"));
    }
}
