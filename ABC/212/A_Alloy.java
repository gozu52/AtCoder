import java.util.Scanner;

public class A_Alloy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();
        if(a!=0 && b==0){
            System.out.println("Gold");
        }else if(a==0 && b!=0){
            System.out.println("Silver");
        }else{
            System.out.println("Alloy");
        }
    }
}
