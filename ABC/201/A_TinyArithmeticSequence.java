import java.util.Arrays;
import java.util.Scanner;

public class A_TinyArithmeticSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        for(int i=0;i<3;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        Arrays.sort(a);
        if(a[2]-a[1] == a[1]-a[0])System.out.println("Yes");
        else System.out.println("No");
    }
}
