import java.util.Scanner;

public class B_Nuts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int sum =0;
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(sc.next())-10;
            if(a[i]>=0)sum+=a[i];
        }
        sc.close();
        System.out.println(sum);
    }
}
