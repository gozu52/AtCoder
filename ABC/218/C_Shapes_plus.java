import java.util.Arrays;
import java.util.Scanner;

public class C_Shapes_plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char[][] s = new char[n][n];
        char[][] t = new char[n][n];
        for(int i=0;i<n;i++){
            s[i] = sc.next().toCharArray();
        }
        for(int i=0;i<n;i++){
            t[i] = sc.next().toCharArray();
        }
        sc.close();
        //入力終了
        //処理開始
        for(int i=0;i<4;i++){
            s = rotate(s);
            arr(s);
        }
        

        //compare 比較結果をbooleanで返す
        if(compare(t, s))System.out.println("Yes");
        else System.out.println("No");        
    }
    public static void arr(char[][] a){
        System.out.println(Arrays.deepToString(a));
    }
    //右90度
    public static char[][] rotate(char[][] a){
        char[][] rotate = new char[a.length][a.length];
        for(int i=a.length-1,k=0;i>=0 && k<a.length;i--,k++){
            for(int j=0;j<a.length;j++){
                rotate[j][k] = a[i][j];
            }
        }
        return rotate;
    }
    //シャープの数
    public static int sharpCount_compare(char[][] a,char[][] b){
        int count_a = 0;
        int count_b = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]=='#')count_a++;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(b[i][j]=='#')count_b++;
            }
        }
        if(count_a==count_b)return count_a;
        return -1;
    }
    public static boolean parallel_shift(char[][] a, char[][] b){
        int sharp_num = sharpCount_compare(a, b);
        if(sharp_num <= 0)return false;
        if(a.length == 1)return true;
        int[][] coordinates_sharpA = new int[sharp_num][2];
        int[][] coordinates_sharpB = new int[sharp_num][2];
        int count_a = 0;
        int count_b = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j] == '#'){
                    coordinates_sharpA[count_a][0] = i;
                    coordinates_sharpA[count_a][1] = j;
                    count_a++;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j] == '#'){
                    coordinates_sharpB[count_b][0] = i;
                    coordinates_sharpB[count_b][1] = j;
                    count_b++;
                }
            }
        }
        int[] each_sharp_dis = new int[2];
        each_sharp_dis[0] = coordinates_sharpA[0][0] - coordinates_sharpB[0][0];
        each_sharp_dis[1] = coordinates_sharpA[0][1] - coordinates_sharpB[0][1];
        for(int i=1;i<sharp_num;i++){
            int[] countdis = new int[2];
            countdis[0] = coordinates_sharpA[i][0] - coordinates_sharpB[i][0];
            countdis[1] = coordinates_sharpA[i][1] - coordinates_sharpB[i][1];
            if(countdis[0]!=each_sharp_dis[0] || countdis[1]!=each_sharp_dis[1])return false;
        }
        return true;
    }
    public static boolean compare(char[][] a, char[][] b){
        for(int i=0;i<4;i++){
            b = rotate(b);
            if(parallel_shift(a, b))return true;
        }
        return false;
    }
}
