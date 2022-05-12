import java.util.*;

public class B_EnlargedCheckerBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        String s1 = "", s2 = "";
        for(int i=0;i<b;i++)s1 += ".";
        for(int i=0;i<b;i++)s1 += "#";
        for(int i=0;i<b;i++)s2 += "#";
        for(int i=0;i<b;i++)s2 += ".";
        while(s1.length()<(b*n))s1 += s1;
        while(s2.length()<(b*n))s2 += s2;
        s1 = s1.substring(0,b*n);
        s2 = s2.substring(0,b*n);
        for(int i=0;i<a*n;i++){
            if((i/a)%2==0){
                System.out.println(s1);
            }else{
                System.out.println(s2);
            }
        }
    }
}
