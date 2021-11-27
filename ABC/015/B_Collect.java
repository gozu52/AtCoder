import java.util.Scanner;

public class B_Collect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int sum =0, cnt =0;
        for(int i=0;i<n;i++){
            a[i]= Integer.parseInt(sc.next());
            sum += a[i];
            if(a[i]!=0)cnt++;
        }
        sc.close();
        System.out.println((int)Math.ceil((double)sum/cnt));
    }
}
