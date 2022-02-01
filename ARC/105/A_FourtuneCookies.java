import java.util.*;

public class A_FourtuneCookies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] c = new int[4];
        for(int i=0;i<4;i++)c[i]=sc.nextInt();
        Arrays.sort(c);
        sc.close();
        if(c[0]+c[3]==c[1]+c[2] || c[3]==c[0]+c[1]+c[2]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
