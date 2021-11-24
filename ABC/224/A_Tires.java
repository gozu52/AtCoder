import java.util.*;

public class A_Tires {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        if(s.endsWith("er"))System.out.println("er");
        else System.out.println("ist");
    }
}
