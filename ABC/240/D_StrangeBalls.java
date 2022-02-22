import java.util.*;

public class D_StrangeBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = 0, cnt = 0;
        Deque<Integer> a = new ArrayDeque<>();
        Deque<Integer> b = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        int kinds = 0;
        for(int i=0;i<n;i++){
            a.add(sc.nextInt());cnt++;
            if(tmp==0){
                kinds++;
                b.add(kinds);
            }else if(tmp==a.getLast()){
                b.add(b.pollLast()+1);
                kinds = b.getLast();
            }else{
                kinds = 1;
                b.add(kinds);
            }
            if(kinds==a.getLast()){
                for(int j=0;j<kinds;j++){
                    a.removeLast();
                    cnt--;
                }
                b.removeLast();
                kinds = 0;
            }
            if(a.size()==0){
                tmp = 0;
            }else {
                tmp = a.getLast();
            }            
            sb.append(cnt+"\n");
        }
        sc.close();
        System.out.println(sb);
    }
}
