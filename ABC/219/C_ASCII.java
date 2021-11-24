import java.util.Arrays;
import java.util.Scanner;

public class C_ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            String temp = sc.next();
            s[i] = ascChange(temp, x);
        }
        sc.close();

        //System.out.println(Arrays.toString(s));
        //System.out.println();
        Arrays.sort(s);
        for(int i=0;i<s.length;i++){
            System.out.println(ascChange(s[i], x));
        }


    }
    public static String ascChange(String s, String x){
        String ans ="";
        for(int i=0;i<s.length();i++){
            char s_temp = s.charAt(i);
            for(int j=0;j<26;j++){ 
                if((int)s_temp == (int)x.charAt(j)){
                    ans += (char)(j + 97);
                    break;
                }
            }
        }
        return ans;
    }
}
