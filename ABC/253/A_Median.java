package ABC.q300.ABC253;

import java.util.*;

public class A_Median {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        sc.close();
        if((a<=b && b<=c) || (c<=b && b<=a)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
