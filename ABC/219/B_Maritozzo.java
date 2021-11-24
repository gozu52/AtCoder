import java.util.*;

public class B_Maritozzo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String s3 = sc.next();
        String t = sc.next();
        sc.close();
        String[] t_arr = t.split("");
        String ans = "";
        for(int i=0;i<t.length();i++){
            if(t_arr[i].equals("1")){
                ans += s1;
            }else if(t_arr[i].equals("2")){
                ans += s2;
            }else if(t_arr[i].equals("3")){
                ans += s3;
            }
        }
        System.out.println(ans);        
    }
}