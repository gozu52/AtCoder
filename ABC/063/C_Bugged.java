import java.util.*;

public class C_Bugged {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int sum = 0;
        int[] s = new int[n];
        for(int i=0;i<n;i++){
            s[i] = Integer.parseInt(sc.next());
            sum += s[i];
        }
        sc.close();
        Arrays.sort(s);
        if(sum%10!=0){
            System.out.println(sum);
            return;
        }
        else{
            for(int i=0;i<n;i++){
                if(s[i]%10!=0){
                    System.out.println(sum-s[i]);
                    return;
                }
            }
        }
        System.out.println(0);
    }
}
