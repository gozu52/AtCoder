import java.util.*;

public class A_HealthMDeath {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), h = sc.nextInt();
        sc.close();
        System.out.println(h%m==0?"Yes":"No");
    }
}
