import java.util.Scanner;

public class B_MergeTown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] town = new String[n];
        int[] num = new int[n]; int avg = 0;
        for(int i=0;i<n;i++){
            town[i] = sc.next();
            num[i] = Integer.parseInt(sc.next());
            avg += num[i];
        }
        sc.close();
        avg /= 2;
        String ans = "atcoder";
        for(int i=0;i<n;i++){
            if(num[i]>avg)ans = town[i];
        }
        System.out.println(ans);
    }
}
