import java.util.Scanner;

public class A_NewGenerationABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();
        if(n<126){
            System.out.println(4);
        }else if(n<212){
            System.out.println(6);
        }else{
            System.out.println(8);
        }
    }
}