import java.util.Scanner;

public class B_CycleHit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        sc.close();

        if(!a.equals(b) && !a.equals(c) && !a.equals(d) && !b.equals(c) && !b.equals(d) && !c.equals(d)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
