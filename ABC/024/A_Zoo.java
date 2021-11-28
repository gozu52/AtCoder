import java.util.Scanner;

public class A_Zoo {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int k = Integer.parseInt(sc.next());
    int s = Integer.parseInt(sc.next());
    int t = Integer.parseInt(sc.next());
    sc.close();
    if(s+t<k){
        System.out.println(a*s+b*t);
    }else{
        System.out.println((a*s+b*t) - (s+t)*c);
    }
    }
}