import java.util.Scanner;

public class A_RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        sc.close();

        if(x==y){
            System.out.println(x);
        }else{
            if(x+y==1)System.out.println(2);
            if(x+y==2)System.out.println(1);
            if(x+y==3)System.out.println(0);
        }
    }
}