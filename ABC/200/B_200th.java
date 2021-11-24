import java.util.Scanner;

public class B_200th {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int k = Integer.parseInt(sc.next());
        sc.close();
        for(int i=0;i<k;i++){
            n = solve(n);
        }
        System.out.println(n);
    }
    public static String solve(String n){
        long tmpN = Long.parseLong(n);
        if(tmpN%200==0){
            tmpN /= 200;
            n = String.valueOf(tmpN);
        }else{
            n += "200";
        }
        return n;
    }
}
