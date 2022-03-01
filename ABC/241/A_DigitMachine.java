import java.util.*;

public class A_DigitMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]a = new int[10];
        for(int i=0;i<=9;i++)a[i]=sc.nextInt();
        sc.close();
        System.out.println(a[a[a[0]]]);
    }
}
