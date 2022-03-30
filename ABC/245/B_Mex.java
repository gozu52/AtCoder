import java.util.*;

public class B_Mex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0;i<n;i++)ts.add(sc.nextInt());
        sc.close();
        for(int i=0;i<10000;i++){
            if(!ts.contains(i)){System.out.println(i);return;}
        }
    }
}
