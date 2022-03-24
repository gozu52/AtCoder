import java.util.*;

public class C_SAT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> normal = new HashSet<>();
        Set<String> exe = new HashSet<>();
        for(int i=0;i<n;i++){
            String s = sc.next();
            normal.add(s);
            if(s.charAt(0)=='!'){
                s = s.substring(1);
            }
            exe.add(s);
        }
        sc.close();
        for(String e: exe){
            String tmp = "!"+e;
            if(normal.contains(e)&&normal.contains(tmp)){
                System.out.println(e);
                return;
            }
        }
        System.out.println("satisfiable");
    }
}
