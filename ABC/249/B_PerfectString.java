import java.util.*;

public class B_PerfectString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        sc.close();
        boolean full = false, half = false;
        Set<Character> set = new HashSet<>();
        for(char c : s){
            set.add(c);
            if(c>='A' && c<='Z'){
                full = true;
            }else if(c>='a' && c<='z'){
                half = true;
            }
        }
        if(full && half && set.size()==s.length){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
