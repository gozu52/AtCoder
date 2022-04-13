import java.util.*;

public class D_Cylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Long> deque = new ArrayDeque<>();
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int query = sc.nextInt();
            if(query == 1){
                long x = sc.nextInt(), c = sc.nextInt();
                deque.addLast(c);
                deque.addLast(x);
            }else{
                long c = sc.nextInt();
                long tmp = deque.pop();
                long tmp2 = deque.pop();
                if(tmp == c){
                    System.out.println(tmp2*tmp);
                }else if(tmp>c){
                    System.out.println(tmp2*c);
                    deque.addFirst(tmp2);
                    deque.addFirst((tmp-c));
                }else{
                    long ans = tmp2*tmp;
                    c -= tmp;
                    while(c>0){
                        tmp = deque.pop();
                        tmp2 = deque.pop();
                        if(tmp>c){
                            ans += tmp2*c;
                        }else{
                            ans += (tmp2*tmp);
                        }
                        c-=tmp;
                        
                    }
                    if(c<0){
                        deque.addFirst(tmp2);
                        deque.addFirst(Math.abs(c));
                    }
                    System.out.println(ans);
                }
            }
        }
        sc.close();
    }
}
