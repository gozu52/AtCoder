import java.util.Scanner;

public class D_StrangeLunchbox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        //int x = Integer.parseInt(sc.next());
        //int y = Integer.parseInt(sc.next());
        int[][] lunchBox = new int[n][2];
        for(int i=0;i<n;i++){
            lunchBox[i][0] = Integer.parseInt(sc.next());
            lunchBox[i][1] = Integer.parseInt(sc.next());
        }
        sc.close();

        
    }
}
