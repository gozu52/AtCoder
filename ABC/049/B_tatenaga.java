import java.util.*;

public class B_tatenaga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt(), w = sc.nextInt();
        char[][] a = new char[h][w];
        for(int i=0;i<h;i++) {
            a[i] = sc.next().toCharArray();
            for(int j=0;j<2;j++){
                for(int k=0;k<a[i].length;k++){
                    System.out.print(a[i][k]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
