import java.util.*;

public class C_AttackSurvival {
    
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), q = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            map.put(i, k-q);
        }
        for(int i=0;i<q;i++){
            int a = sc.nextInt();
            map.put(a,map.get(a)+1);
        }
        for(int i=1;i<=n;i++){
            if(map.get(i)>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
        sc.close();
    }
}
