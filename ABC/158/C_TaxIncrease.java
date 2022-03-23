import java.util.Scanner;

public class C_TaxIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        sc.close();
        for(int i=1;i<=1250;i++){
            int temp_a = (int)(0.08*i);
            int temp_b = (int)(0.1*i);
            if(temp_a == a && temp_b == b){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
