import java.util.Scanner;

public class B_Saving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();
        int money =0;
        for(int i=1;i<=n;i++){
            money += i;
            if(money>=n){
                System.out.println(i);
                break;
            }
        }
    }
}
