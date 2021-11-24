import java.util.*;

public class B_StringString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String[] ans = shift(s);
        Arrays.sort(ans);
        System.out.println(ans[0]);
        System.out.println(ans[ans.length-1]);

    }
    public static String[] shift(String str){
        String[] ans_arr = new String[str.length()];
        for(int i=0;i<str.length();i++){
            String[] tmp = str.split("");
            str ="";
            str += tmp[tmp.length-1];
            for(int j=0;j<tmp.length-1;j++){
                str += tmp[j];
            }
            ans_arr[i]=str;
        }
        return ans_arr;
    }
}
