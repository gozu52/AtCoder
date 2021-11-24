import java.util.*;

public class A_FindMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());
        sc.close();
        for(int i=a;i<=b;i++){
            if(i%c==0){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
