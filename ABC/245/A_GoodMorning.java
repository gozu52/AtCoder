import java.util.*;

public class A_GoodMorning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt(), d = sc.nextInt();
        sc.close();
        String ans = "";
        if(a==c && b==d){
            if(b==d)ans = "Takahashi";
            else if(b<d)ans = "Takahashi";
            else ans = "Aoki";
        }else if(a<c){
            ans = "Takahashi";
        }else{
            ans = "Aoki";
        }
        System.out.println(ans);
    }
}
