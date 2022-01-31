import java.util.*;

public class D_LRInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();
        Deque<Integer> que1 = new ArrayDeque<>();
        que1.add(n);
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='L'){
                que1.addLast(i);
            }else{
                que1.addFirst(i);
            }
        }
        for(Integer e: que1){
            System.out.print(e+" ");
        }
    }   
}