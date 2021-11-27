import java.util.Scanner;

public class B_ABProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =Integer.parseInt(sc.next());
        int b =Integer.parseInt(sc.next());
        int c =Integer.parseInt(sc.next());
        sc.close();
        int abp = a+b;
        int abm = a-b;
        if(c==abp && c==abm){
            System.out.println("?");
        }else if(c==abp){
            System.out.println("+");
        }else if(c==abm){
            System.out.println("-");
        }else{
            System.out.println("!");
        }
    }
}
