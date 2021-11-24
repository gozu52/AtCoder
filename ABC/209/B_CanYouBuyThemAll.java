import java.util.Scanner;

public class B_CanYouBuyThemAll {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] a = new int[n];
        int sum =0;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                a[i] = Integer.parseInt(sc.next())-1;
            }else{
                a[i] = Integer.parseInt(sc.next());
            }
            sum += a[i];
        }
        sc.close();
        if(x>=sum){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}