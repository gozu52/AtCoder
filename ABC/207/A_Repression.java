import java.util.Arrays;
import java.util.Scanner;

public class A_Repression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum[] = new int[3];
        for(int i=0;i<3;i++){
            sum[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        Arrays.sort(sum);
        System.out.println(sum[2]+sum[1]);

    }
}
