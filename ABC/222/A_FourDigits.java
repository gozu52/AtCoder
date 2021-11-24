import java.util.*;

public class A_FourDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();
        if(n.length()==4){
            System.out.println(n);
        }else{
            for(int i=n.length();i<4;i++){
                System.out.print(0);
            }
            System.out.println(n);
        }
    }
}
