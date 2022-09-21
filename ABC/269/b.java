import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] s = new char[10][10];
        for(int i=0;i<10;i++){
            s[i] = sc.next().toCharArray();
        }
        sc.close();
        int a=-1, b=-1,c=-1,d=-1; 
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(a==-1&&c==-1&&s[i][j]=='#'){
                    a = i; c= j;
                }
                if(d==-1 && ((j<9 && s[i][j+1]!='#' && s[i][j]=='#') ||j==9&&s[i][j]=='#')){
                    d = j;
                }
                if(b==-1 && ((i<9 && s[i+1][j]!='#' && s[i][j]=='#') ||i==9&&s[i][j]=='#')){
                    b = i;
                }
            }
        }
        a++;b++;c++;d++;
        System.out.println(a+" "+b);
        System.out.println(c+" "+d);
    }
}
