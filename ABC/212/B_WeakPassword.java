import java.util.Scanner;

public class B_WeakPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tx = sc.next();
        String[] x_arr = tx.split("");
        int x[] = new int[4];
        for(int i=0;i<4;i++){
            x[i] = Integer.parseInt(x_arr[i]);
        }
        sc.close();
        System.out.println(pass(x));
    }
    public static String pass(int x[]){
        String ans = "Weak";
        if(x[0]==x[1] && x[0]==x[2] && x[0]==x[3]){
            ans = "Weak";
        }else{
            for(int i=0;i<3;i++){
                if(!((x[i]+1)%10 == x[i+1])){
                    ans = "Strong";
                }
            }
        }
        return ans;
    }
}
