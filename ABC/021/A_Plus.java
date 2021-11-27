import java.util.Scanner;

public class A_Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();
        int count = 0;
        int[] ans = new int[10];
        while(n>0){
            if(n>=8){
                ans[count] = 8;
                count++;
                n -= 8;
            }else if(n>=4){
                ans[count] = 4;
                count++;
                n -= 4;
            }else if(n>=2){
                ans[count] = 2;
                count++;
                n -= 2;
            }else if(n>=1){
                ans[count] = 1;
                count++;
                n -= 1;
            }
        }
        System.out.println(count);
        for(int i=0;i<10;i++){
            if(ans[i]!=0)System.out.println(ans[i]);
        }
    }
}
