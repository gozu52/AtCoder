import java.util.*;

public class SignUpRequests_027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> set = new HashSet<String>();
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(int i=0;i<n;i++){
            String s = sc.next();cnt++;
            if(!set.contains(s))sb.append(cnt+"\n");
            set.add(s);
        }
        sc.close();
        System.out.println(sb);
    }
}