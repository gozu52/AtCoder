import java.util.Scanner;

public class A_Quiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.next());
        sc.close();
        String[] ans = new String[2];
        ans[0]="ABC";
        ans[1]="chokudai";
        System.out.println(ans[q-1]);    
    
    }
}
