import java.util.Scanner;

public class A_MaxiBuying {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();
        double ans = Math.floor(n*1.08);
        if(ans<206){
            System.out.println("Yay!");
        }else if(ans >206){
            System.out.println(":(");
        }else{
            System.out.println("so-so");
        }
    }
}
