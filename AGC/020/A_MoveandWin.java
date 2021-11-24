import java.util.Scanner;

public class A_MoveandWin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();
        MW(n, a, b);

    }
    public static void MW(int n, int a , int b){
        if((a+b)%2==0){
            System.out.println("Alice");
        }else{
            System.out.println("Borys");
        }
    }
}
