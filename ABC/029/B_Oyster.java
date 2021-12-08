import java.util.Scanner;

public class B_Oyster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ans = new String[12];
        for(int i=0;i<12;i++){
            ans[i]= sc.next();
        }
        sc.close();
        int count =0;
        for(int i=0;i<12;i++){
            if(ans[i].contains("r")){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
