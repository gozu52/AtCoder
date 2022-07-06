import java.util.*;

public class C_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        while(q-->0){
            int t = sc.nextInt();
            int x = sc.nextInt();
            if(t==1){
                cnt = (cnt+n-x)%n;
            }else{ 
                sb.append(s.charAt((cnt+x-1)%n)+"\n");
            }
        }
        sc.close();
        System.out.println(sb.toString());
    }
}
