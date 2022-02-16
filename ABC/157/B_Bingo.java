import java.util.*;

public class B_Bingo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] bingo = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                bingo[i][j] = sc.nextInt();
            }
        }
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int x = sc.nextInt();
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(bingo[j][k]==x)bingo[j][k]=0;
                }
            }
        }
        sc.close();
        if((bingo[0][0]+bingo[0][1]+bingo[0][2]==0)||(bingo[1][0]+bingo[1][1]+bingo[1][2]==0)||(bingo[2][0]+bingo[2][1]+bingo[2][2]==0)){
            System.out.println("Yes");
        }else if((bingo[0][0]+bingo[1][0]+bingo[2][0]==0)||(bingo[0][1]+bingo[1][1]+bingo[2][1]==0)||(bingo[0][2]+bingo[1][2]+bingo[2][2]==0)){
            System.out.println("Yes");
        }else if((bingo[0][0]+bingo[1][1]+bingo[2][2]==0)||(bingo[0][2]+bingo[1][1]+bingo[2][0]==0)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}

