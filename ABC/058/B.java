import java.util.*;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] o =  sc.next().toCharArray();
        char[] e = sc.next().toCharArray();
        sc.close();
        int i= 0;
        for(;i<Math.min(o.length,e.length);i++){
            System.out.print(o[i]+""+e[i]);
        }
        if(o.length>e.length){
            for(;i<o.length;i++){
                System.out.print(o[i]);
            }
        }else{
            for(;i<e.length;i++){
                System.out.print(e[i]);
            }
        }
    }
}
