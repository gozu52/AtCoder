import java.util.*;

public class A_AtCoderQuiz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(sc.next());
        sc.close();
        if(x<40){
            System.out.println(40-x);
        }else if(x<70){
            System.out.println(70-x);
        }else if(x<90){
            System.out.println(90-x);
        }else System.out.println("expert");
    }
}
