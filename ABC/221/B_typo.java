import java.util.*;

public class B_typo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        if(s.equals(t)){
            System.out.println("Yes");
            return;
        }
        for(int i=0;i<s.length()-1;i++){
            String ans = s.substring(0, i) + s.charAt(i+1) + s.charAt(i) + s.substring(i+2);
            System.out.println(ans);
            if(ans.equals(t)){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
