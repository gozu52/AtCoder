import java.util.Arrays;
import java.util.Scanner;

public class A_TakahashiAndAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        for(int i=0;i<3;i++)age[i] = Integer.parseInt(sc.next());
        sc.close();
        Arrays.sort(age);
        System.out.println(age[1]);
    }
}
