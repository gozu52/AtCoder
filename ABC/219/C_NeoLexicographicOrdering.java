import java.util.Arrays;
import java.util.Scanner;

public class C_NeoLexicographicOrdering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int n = Integer.parseInt(sc.next());
        String[] s = new String[n];
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<n;i++){
            String temp = sc.next();
            s[i] = changeAlpa(alphabet, x, temp);
        }
        sc.close();

        System.out.println(Arrays.toString(s));
        System.out.println();
        Arrays.sort(s);
        for(int i=0;i<s.length;i++){
            System.out.println(changeAlpa(x,alphabet,s[i]));
        }


    }
    public static String changeAlpa(String a, String alp_seq, String s){
        String ans ="";
        for(int i=0;i<s.length();i++){
            //ASCII
            char s_temp = s.charAt(i);
            for(int j=0;j<26;j++){
                if(s_temp == alp_seq.charAt(j)){
                    ans += a.charAt(j);
                    break;
                }
            }
        }
        return ans;
    }
}
