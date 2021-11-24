import java.util.Scanner;

public class A_OddvsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.next());
        for(int i=0;i<t;i++){
            long n = Long.parseLong(sc.next());
            if(n%4==0){
                System.out.println("Even");
            }else if(n%2==0){
                System.out.println("Same");
            }else{
                System.out.println("Odd");
            }
        }
        sc.close();
    }
}
