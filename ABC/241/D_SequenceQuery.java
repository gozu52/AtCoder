import java.util.*;

public class D_SequenceQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        TreeMap<Long, Integer> p = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<q;i++){
            int que = sc.nextInt();
            long x = sc.nextLong();
            if(que==1){
                p.put(x, p.getOrDefault(x, 0)+1);
            }else if(que==2){
                int k = sc.nextInt();
                long key = x+1;
                while(k>0 && p.lowerKey(key)!=null){
                    key = p.lowerKey(key);
                    k-=p.get(key);
                }
                if(k>0)sb.append("-1\n");
                else sb.append(key+"\n");
            }else{
                int k = sc.nextInt();
                long key = x-1;
                while(k>0 && p.higherKey(key)!=null){
                    key = p.higherKey(key);
                    k-=p.get(key);
                }
                if(k>0)sb.append("-1\n");
                else sb.append(key+"\n");
            }                        
        }
        sc.close();
        System.out.println(sb);
    }
}
