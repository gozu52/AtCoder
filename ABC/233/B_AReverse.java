import java.util.*;

public class B_AReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt()-1;
        int r = sc.nextInt()-1;
        String s = sc.next();
        sc.close();
        String[] arr = s.split("");
        while(r>l){
            String tmp = arr[l];
            arr[l] = arr[r];
            arr[r] = tmp;
            l++;r--;
        }
        for(String e: arr)System.out.print(e);
    }
}