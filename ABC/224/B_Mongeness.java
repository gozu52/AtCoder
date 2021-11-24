import java.util.*;

public class B_Mongeness {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int a[][] = new int[h][w];
        for(int i=0;i<h;i++){
            for(int j =0;j<w;j++){
                a[i][j] = Integer.parseInt(sc.next());
            }
        }
        sc.close();
        if(check(a, h, w))System.out.println("Yes");
        else System.out.println("No");

    }
    public static boolean check(int a[][],int h,int w){
        for(int i=0;i<h-1;i++){
            for(int j=0;j<w-1;j++){
                if(!(a[i][j]+a[i+1][j+1] <= a[i+1][j]+a[i][j+1])){
                    return false;
                }
            }
        }
        return true;
    }
}
