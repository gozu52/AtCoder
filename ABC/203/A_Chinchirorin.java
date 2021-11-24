import java.util.Scanner;

public class A_Chinchirorin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        sc.close();
        if(a!=b && a!=c && b!=c){
            System.out.println(0);
        }else if(a==b && a==c && b==c){
            System.out.println(a);
        }else{
            if(a==b)System.out.println(c);
            if(a==c)System.out.println(b);
            if(b==c)System.out.println(a);
        }
    }    
}