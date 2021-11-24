import java.util.Scanner;

public class A_RollingDice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();
        if(a<=b && b<=a*6){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
