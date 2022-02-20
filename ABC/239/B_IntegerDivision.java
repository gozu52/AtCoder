import java.util.*;

public class B_IntegerDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        sc.close();
        if(x>=0 || x%10==0){
            System.out.println(x/10);
        }else{
            System.out.println(x/10-1);
        }        
    }   
}