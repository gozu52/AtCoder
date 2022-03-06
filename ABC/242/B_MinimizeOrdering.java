import java.util.*;

public class B_MinimizeOrdering {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] arr = s.toCharArray();
        sc.close();
        Arrays.sort(arr);
        for(char e:arr){
            System.out.print(e);
        }
    }
}
