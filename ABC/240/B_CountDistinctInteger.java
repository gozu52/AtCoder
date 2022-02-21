import java.util.*;

public class B_CountDistinctInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<n;i++)set.add(sc.nextInt());
        sc.close();  
        System.out.println(set.size());
    }   
}