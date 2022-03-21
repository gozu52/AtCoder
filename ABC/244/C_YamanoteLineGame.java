import java.util.*;

public class C_YamanoteLineGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<Integer>();
        for(int i=1;i<=(2*n+1);i++){
            x.add(i);
        }
        boolean flag = true;
        while(flag){
            System.out.println(x.get(0));
            x.remove(0);
            int aoki = sc.nextInt();
            if(aoki==0){
                flag = false;
                return;
            }
            x.remove(x.indexOf(aoki));
        }
    }
}
