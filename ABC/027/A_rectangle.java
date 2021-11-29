import java.util.Scanner;

public class A_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1 = Integer.parseInt(sc.next());
        int l2 = Integer.parseInt(sc.next());
        int l3 = Integer.parseInt(sc.next());
        sc.close();
        if(l1==l2){
            System.out.println(l3);
        }else if(l1==l3){
            System.out.println(l2);
        }else{
            System.out.println(l1);
        }
    }
}
