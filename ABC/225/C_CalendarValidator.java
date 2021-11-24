import java.util.*;

public class C_CalendarValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        long[][] b = new long[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                b[i][j] = Integer.parseInt(sc.next());
            }
        }
        sc.close();


        for(int i=0;i<m-1;i++){
            if(!(b[0][i]==b[0][i+1]-1)){
                System.out.println("No");
                return;
            }
        }
        /*
        for(int i=0;i<n-1;i++){
            if(!(b[i][0]==b[i+1][0]-7)){
                System.out.println("No");
                return;
            }
        }
        */
        for(int i=0;i<n-1;i++){
            for(int j=0;j<m-1;j++){
                if(b[i][j] == b[i][j+1] - 1 && b[i][j] == b[i+1][j]-7 && b[i][j]%7!=0){
                    continue;
                }else{
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }
}