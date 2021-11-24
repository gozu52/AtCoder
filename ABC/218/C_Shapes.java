import java.util.*;

public class C_Shapes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        char[][] s = new char[n][n];
        char[][] t = new char[n][n];
        for(int i=0;i<n;i++){
            s[i]=sc.next().toCharArray();
        }
        for(int i=0;i<n;i++){
            t[i]=sc.next().toCharArray();
        }
        sc.close();
        char[][] s_copy=copy(s, n);
        //int[] t_countCircleTop =new int[2];
        int[] t_countCircleLeft =new int[2];
        //t_countCircleTop = countCircleTop(t, n);
        t_countCircleLeft = countCircleLeft(t, n);


        char[][] right_rotate = copy(s_copy, n);
        char[][] reverse_rotate = copy(right_rotate, n);
        char[][] left_rotate = copy(reverse_rotate, n);


        int[] s_countCirlceLeft = new int[2];
        s_countCirlceLeft = countCircleLeft(s, n);

        char[][] temp1 = upDown(s, n, s_countCirlceLeft, t_countCircleLeft);
 
        temp1 = leftRight(temp1, n, s_countCirlceLeft, t_countCircleLeft);

        
        boolean flag = false;
        //
        //for分で入れるなら90度から始める

        //処理
        //回転なし
        flag = fix_circleCount(t, temp1, n);
        if(flag == true){
            System.out.println("Yes1");
            return;
        }

        //右９０
        s_countCirlceLeft = countCircleLeft(s, n);
        right_rotate = upDown(right_rotate, n, s_countCirlceLeft, t_countCircleLeft);
        flag = fix_circleCount(t, right_rotate, n);
        if(flag == true){
            System.out.println("Yes2");
            return;
        }

        //右１８０
        s_countCirlceLeft = countCircleLeft(s, n);
        reverse_rotate = upDown(reverse_rotate, n, s_countCirlceLeft, t_countCircleLeft);
        flag = fix_circleCount(t, reverse_rotate, n);
        if(flag == true){
            System.out.println("Yes3");
            return;
        }

        //右２７０
        s_countCirlceLeft = countCircleLeft(s, n);
        left_rotate = upDown(left_rotate, n, s_countCirlceLeft, t_countCircleLeft);
        flag = fix_circleCount(t, left_rotate, n);
        if(flag == true){
            System.out.println("Yes4");
            return;
        }

        System.out.println("No");


    }
    //deep copy of arrays
    public static char[][] copy(char[][] s,int n){
        char[][] copy = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                copy[i][j]=s[i][j];
            }
        }
        return copy;
    }
    //右90度rotate
    public static char[][] turn_right(char[][] s,int n){
        char[][] rotate = new char[n][n];
        for(int i=n-1,k=0;i>=0 && k<n;i--,k++){
            for(int j=0;j<n;j++){
                rotate[j][k]=s[i][j];
            }
        }
        return rotate;
    }
    //上端シャープの位置
    public static int[] countCircleTop(char[][] t,int n){
        int[] count =new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(t[i][j]=='#'){
                    count[0]=i;
                    count[1]=j;
                }
                if(count[1]!=0)break;
            }
            if(count[1]!=0)break;
        }
        return count;
    }
    //左端のシャープの位置
    public static int[] countCircleLeft(char[][] t,int n){
        int count[] =new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(t[j][i]=='#'){
                    count[0]=j;
                    count[1]=i;
                }
                if(count[1]!=0)break;
            }
            if(count[1]!=0)break;
        }
        return count;
    }
    //シャープの数 int
    public static int circleCount(char s[][], int n){
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(s[i][j]=='#')count++;
            }
        }
        return count;
    }
    //シャープの数 s!=t -> false, s==t true
    public static boolean fix_circleCount(char s[][], char s_move[][], int n){
        int s_count =0;
        int s_move_count = 0;
        boolean flag = false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(s[i][j]=='#')s_count++;
                if(s_move[i][j]=='#')s_move_count++;
            }
        }
        if(s_count==s_move_count)flag = true;
        return flag;
    }
    //左右平行移動
    public static char[][] leftRight(char s[][],int n,int[] s_countCircleLeft,int[] t_countCircleLeft){
        char[][] moving = copy(s, n);
        if(t_countCircleLeft[1]==s_countCircleLeft[1]){

        }else if(t_countCircleLeft[1]>s_countCircleLeft[1]){
            //右
            int yoko = t_countCircleLeft[1]-s_countCircleLeft[1];
            for(int i=0;i<n;i++){
                for(int j=0;j<yoko;j++){
                    moving[i][j] ='.';
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n-yoko;j++){
                    moving[i][j+yoko] = s[i][j];
                }
            }

        }else if(t_countCircleLeft[1]<s_countCircleLeft[1]){
            //左
            int yoko = s_countCircleLeft[1]-t_countCircleLeft[1];
            for(int i=0;i<n;i++){
                for(int j=n-1;j>=n-yoko;j--){
                    moving[i][j]='.';
                }
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n-yoko;j++){
                    moving[i][j] = s[i][j];
                }
            }

        }
        return moving;
    }
    //上下平行移動
    public static char[][] upDown(char s[][],int n,int[] s_countCircleLeft,int[] t_countCircleLeft){
        char[][] moving = copy(s, n);
        if(t_countCircleLeft[0]==s_countCircleLeft[0]){

        }else if(t_countCircleLeft[0]>s_countCircleLeft[0]){
            //下
            int tate = t_countCircleLeft[0]-s_countCircleLeft[0];
            for(int i=0;i<tate;i++){
                for(int j=0;j<n;j++){
                    moving[i][j]='.';
                }
            }
            for(int i=0;i<n-tate;i++){
                for(int j=0;j<n;j++){
                    moving[i+tate][j]=s[i][j];
                }
            }

        }else if(t_countCircleLeft[0]<s_countCircleLeft[0]){
            //上
            int tate = s_countCircleLeft[0]-t_countCircleLeft[0];
            for(int i=n-1;i>=n-tate;i--){
                for(int j=0;j<n;j++){
                    moving[i][j]='.';
                }
            }
            for(int i=0;i<n-tate;i++){
                for(int j=0;j<n;j++){
                    moving[i][j]=s[i][j];
                }
            }

        }
        return moving;
    }
}