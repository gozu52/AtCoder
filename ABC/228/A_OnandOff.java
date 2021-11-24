import java.util.*;

public class A_OnandOff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        sc.close();


        if(s<t){
            for(int i=s;i<t;i++){
                if(x==i){
                    System.out.println("Yes");
                    return;
                }
            }
        }else{
            for(int i=s;i<24;i++){
                if(x==i){
                    System.out.println("Yes");
                    return;
                }
            }
            for(int i=0;i<t;i++){
                if(x==i){
                    System.out.println("Yes");
                    return;
                }
            }

        }
        System.out.println("No");
    }
}
