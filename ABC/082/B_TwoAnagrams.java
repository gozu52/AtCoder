import java.util.*;

public class B_TwoAnagrams {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        sc.close();
        String[] stmp = s.split("");
        String[] ttmp = t.split("");
        Arrays.sort(stmp);
        Arrays.sort(ttmp);
        String[] ans = new String[2];
        Arrays.fill(ans, "");
        for(String e: stmp){
            ans[0] += e;
        }
        for(int i=ttmp.length-1;i>=0;i--){
            ans[1] += ttmp[i];
        }
        if(!checkSame(ans))System.out.println("No");
        else System.out.println("Yes");
    }
    public static boolean checkSame(String ans[]){
        String anss = ans[0];
        Arrays.sort(ans);
        if(ans[0].equals(ans[1]))return false;
        if(!ans[0].equals(anss))return false;
        return true;
    }
}
