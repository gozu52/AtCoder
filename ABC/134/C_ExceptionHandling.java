import java.util.*;

public class C_ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
            b[i] = a[i];
        }
        sc.close();
        Arrays.sort(b);
        for(int i=0;i<n;i++){
            if(a[i]==b[n-1]){
                System.out.println(b[n-2]);
            }else{
                System.out.println(b[n-1]);
            }
        }
    }
}
