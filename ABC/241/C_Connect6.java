import java.util.*;

public class C_Connect6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] masu = new char[n][n];
        for(int i=0;i<n;i++)masu[i] = sc.next().toCharArray();
        sc.close();
        boolean flag = false;
        process:
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j+5<n){
                    int cnt = 0;
                    for(int k=0;k<6;k++){
                        if(masu[i][j+k]=='#')cnt++;
                    }
                    if(cnt>=4){
                        flag = true;
                        break process;
                    }
                }
                if(i+5<n){
                    int cnt = 0;
                    for(int k=0;k<6;k++){
                        if(masu[i+k][j]=='#')cnt++;
                    }
                    if(cnt>=4){
                        flag = true;
                        break process;
                    }
                }
                if(i+5<n && j+5<n){
                    int cnt = 0;
                    for(int k=0;k<6;k++){
                        if(masu[i+k][j+k]=='#')cnt++;
                    }
                    if(cnt>=4){
                        flag = true;
                        break process;
                    }
                }
                if(i+5<n && j-5>=0){
                    int cnt = 0;
                    for(int k=0;k<6;k++){
                        if(masu[i+k][j-k]=='#')cnt++;
                    }
                    if(cnt>=4){
                        flag = true;
                        break process;
                    }
                }
            }
        }
        if(flag)System.out.println("Yes");
        else System.out.println("No");
    }
}
