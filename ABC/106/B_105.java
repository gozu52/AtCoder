import java.util.Scanner;

public class B_105 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        sc.close();
        int cnt = 0;
        for(int i=1;i<=n;i+=2){
            int tmp = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0)tmp++;
            }
            if(tmp==8){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
