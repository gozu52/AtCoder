import java.util.Scanner;

public class C_DuodecimFerra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        sc.close();
        long ans = (l-1);
        for(int i=2;i<=11;i++)ans = ans*(l-i)/i;
        System.out.println(ans);
    }
}
