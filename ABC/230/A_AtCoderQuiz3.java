import java.util.*;

public class A_AtCoderQuiz3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();
        if(n<10){
            System.out.println("AGC00"+n);
        }else if(n<42){
            System.out.println("AGC0"+n);
        }else{
            System.out.println("AGC0"+(n+1));
        }
    }
}
