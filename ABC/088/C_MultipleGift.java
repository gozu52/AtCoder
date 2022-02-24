import java.util.Scanner;

public class C_MultipleGift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong(), y = sc.nextLong();
        sc.close();
        long cnt = 1;
        for(long i = x;i<= y;){
            if(i*2<=y){
                i *= 2;
                cnt++;
            }else{
                break;
            }
        }
        System.out.println(cnt);
    }
}
