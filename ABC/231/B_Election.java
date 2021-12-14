import java.util.*;

public class B_Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = sc.next();
        }
        sc.close();
        int ans = 0;
        String sans = "";
        for(int i=0;i<n;i++){
            int cnt = 0;
            for(int j=0;j<n;j++){
                if(s[i].equals(s[j]))cnt++;
            }
            if(cnt>ans){
                ans = cnt;
                sans = s[i];
            }
        }
        System.out.println(sans);
    }   
}
