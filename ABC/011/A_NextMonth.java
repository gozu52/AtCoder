import java.util.Scanner;

public class A_NextMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();
        if(n==12){
            System.out.println(1);
        }else{
            System.out.println(n+1);
        }
    }
}
