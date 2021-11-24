import java.util.Scanner;

public class C_Shapes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char[][] s = new char[n][n];
        char[][] t = new char[n][n];
        for(int i=0;i<n;i++){
            s[i]= sc.next().toCharArray();
        }
        for(int i=0;i<n;i++){
            t[i] = sc.next().toCharArray();   
        }
        sc.close();

        if(sameShape(s, t))System.out.println("Yes");
        else System.out.println("No");
    }
    public static void show(char[][] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static char[][] rotate(char[][] a){
        char[][] rotate = new char[a.length][a.length];
        for(int i=a.length-1,k=0;i>=0 && k<a.length;i--,k++){
            for(int j=0;j<a.length;j++){
                rotate[j][k] = a[i][j];
            }
        }
        return rotate;
    }
    
    public static int sharpCnt(char[][] a,char[][] b){
        int cnt_a = 0;
        int cnt_b = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j] == '#')cnt_a++;
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(b[i][j] == '#')cnt_b++;
            }
        }
        if(cnt_a==cnt_b) return cnt_a;
        return -1;
    }

    public static boolean parallelShifts(char[][] a,char[][] b){
        int sharp_num = sharpCnt(a, b);
        if(sharp_num<=0)return false;
        if(sharp_num==1)return true;

        int[][] coordinates_sharpA = new int[sharp_num][2];
        int[][] coordinates_sharpB = new int[sharp_num][2];
        int sharp_cntA = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j] == '#'){
                    coordinates_sharpA[sharp_cntA][0] = i;
                    coordinates_sharpA[sharp_cntA][1] = j;
                    sharp_cntA++;
                }
            }
        }
        int sharp_cntB = 0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(b[i][j] == '#'){
                    coordinates_sharpB[sharp_cntB][0] = i;
                    coordinates_sharpB[sharp_cntB][1] = j;
                    sharp_cntB++;
                }
            }
        }

        int[] base_dis = new int[2];
        base_dis[0] = coordinates_sharpA[0][0] - coordinates_sharpB[0][0];
        base_dis[1] = coordinates_sharpA[0][1] - coordinates_sharpB[0][1];
        for(int i=1;i<sharp_cntA;i++){
            int[] cmp_dis = new int[2];
            cmp_dis[0] = coordinates_sharpA[i][0] - coordinates_sharpB[i][0];
            cmp_dis[1] = coordinates_sharpA[i][1] - coordinates_sharpB[i][1];
            if(cmp_dis[0] != base_dis[0] || cmp_dis[1] != base_dis[1])return false;
        }
        return true;
    }
    
    public static boolean sameShape(char[][] a,char[][] b){
        for(int i=0;i<4;i++){
            a = rotate(a);
            if(parallelShifts(a, b))return true;
        }
        return false;
    }
    

}

