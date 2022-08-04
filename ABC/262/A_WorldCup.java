import java.util.*;

public class A_WorldCup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        sc.close();
        if(y%4==2){
            System.out.println(y);
        }else{
            if(y%4==0)System.out.println(y+2);
            if(y%4==1)System.out.println(y+1);
            if(y%4==3)System.out.println(y+3);
        }
    }
}