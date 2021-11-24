import java.util.Scanner;

public class A_SomethingOnIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String[] a = s.split("");
        int count =0;
        for(int i=0;i<s.length();i++){
            if(a[i].equals("o")) count++;
        }
        System.out.println(700+(100*count));
    }
}
