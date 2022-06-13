import java.util.*;

public class C_MaxMinQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        while(q-->0){
            int num = sc.nextInt();
            if(num==1){
                int x = sc.nextInt();
                if(map.containsKey(x)){
                    map.put(x, map.get(x)+1);
                }else{
                    map.put(x,1);
                }
            }else if(num==2){
                int x = sc.nextInt(), c = sc.nextInt();
                if(map.containsKey(x) && map.get(x)>c){
                    map.put(x, map.get(x)-c);
                }else{
                    map.remove(x);
                }            
            }else if(num==3){
                sb.append((map.lastKey()-map.firstKey())+"\n");
            }
        }
        sc.close();
        System.out.println(sb.toString());
    }
}
