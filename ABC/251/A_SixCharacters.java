import java.util.Scanner;

public class A_SixCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        if(s.length()==1)System.out.println(s+s+s+s+s+s);
        else if(s.length()==2)System.out.println(s+s+s);
        else System.out.println(s+s);
    }
}
