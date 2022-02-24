import java.util.Scanner;

public class B_Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt(), w1 = sc.nextInt();
        int h2 = sc.nextInt(), w2 = sc.nextInt();
        sc.close();
        if((h1==h2 || w1==w2) || (h1==w2 || w1==h2)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
