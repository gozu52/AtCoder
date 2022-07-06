import java.util.*;

public class A_When {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        if(k%60<10){
            System.out.println((21+(k/60))+":0"+(k%60));
        }else{
            System.out.println((21+(k/60))+":"+(k%60));
        }
    }
}
