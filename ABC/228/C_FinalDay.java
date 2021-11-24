import java.util.*;

public class C_FinalDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());
        int[] p = new int[n];
        int[] sum = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                p[i] += Integer.parseInt(sc.next());
            }
            sum[i] = p[i];
        }
        sc.close();
        Arrays.sort(sum);
        int point = sum[n-k];
        for(int i=0;i<n;i++){
            if(p[i]+300>=point){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
