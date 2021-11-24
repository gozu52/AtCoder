import java.util.*;

public class B_dictionaryOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        if(a.equals("a")){
            System.out.println(-1);
            return;
        }
        if(a.length()==1)System.out.println("a");
        else{
            for(int i=0;i<a.length()-1;i++){
                System.out.print(a.charAt(i));
            }
        }
    }
}
