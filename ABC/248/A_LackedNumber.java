import java.util.*;

public class A_LackedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        sc.close();
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        for(int i=0,j=0;i<s.length&&j<9;i++,j++){
            if(s[i]!='0'+j){
                System.out.println(j);
                return;
            }
        }
        System.out.println(9);
    }
}