import java.util.*;

public class D_ANDandSUM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<t;i++){
            long a = sc.nextLong();
            long s = sc.nextLong();
            sb.append(calc(a, s));
        }
        sc.close();
        System.out.println(sb);
    }
    static String calc(long a, long s){
        if(s>=a*2 && (((s-(a*2))&a)==0))return "Yes\n";
        return "No\n";
    }
}
