import java.util.Scanner;

public class A_CountUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String ans = "1";
    
        for(int i=0;i<n-1;i++){
            ans = ans+"0";
        }
        ans =ans+"7";
        System.out.println(ans);

    }
}
