import java.util.*;

public class B_CountingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        HashSet<List<String>> set = new HashSet<>();
        for(int i=0;i<n;i++){
            List<String> list = new ArrayList<>();
            int l = Integer.parseInt(sc.next());
            for(int j=0;j<l;j++){
                String tmp = sc.next();
                list.add(tmp);
            }
            set.add(list);
        }
        sc.close();
        System.out.println(set.size());
    }    
}
