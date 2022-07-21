import java.util.*;

public class A_UniqueLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        if(s.charAt(0)==s.charAt(1) && s.charAt(0)==s.charAt(2)){
            System.out.println(-1);
        }else if(s.charAt(0)==s.charAt(1)){
            System.out.println(s.charAt(2));
        }else if(s.charAt(0)==s.charAt(2)){
            System.out.println(s.charAt(1));
        }else{
            System.out.println(s.charAt(0));
        }
    }
}