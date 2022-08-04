import java.util.*;

public class C_NewFolder1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            String s = sc.next();
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
                sb.append(s).append("(").append(map.get(s)).append(")");
                sb.append("\n");
            }else{
                map.put(s, 0);
                sb.append(s);
                sb.append("\n");
            }
        }
        sc.close();
        System.out.println(sb.toString());
    }
}
