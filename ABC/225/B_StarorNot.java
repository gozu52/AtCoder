import java.util.*;

public class B_StarorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[][] ab = new int[n-1][2];
        for(int i=0;i<n-1;i++){
            ab[i][0]=Integer.parseInt(sc.next())-1;
            ab[i][1]=Integer.parseInt(sc.next())-1;
        }
        sc.close();

        int start1 = ab[0][0];
        int start2 = ab[0][1];
        int count1 = 1, count2 = 1;
        for(int i=1;i<n-1;i++){
            if(ab[i][0]==start1 || ab[i][1]==start1)count1++;
            if(ab[i][0]==start2 || ab[i][1]==start2)count2++;
        }
        if(count1==n-1 || count2==n-1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }    
}