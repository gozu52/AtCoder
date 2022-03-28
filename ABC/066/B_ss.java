import java.util.*;

public class B_ss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        for(int i=s.length()-2;i>0;i-=2){
            if(s.substring(0,i/2).equals(s.substring(i/2,i))){
                System.out.println(i);
                return;
            }
        }
    }
}
