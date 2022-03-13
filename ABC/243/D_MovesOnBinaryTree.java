import java.util.*;

public class D_MovesOnBinaryTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        String x = Long.toBinaryString(sc.nextLong());
        String s = sc.next();
        Deque<Character> dq = new ArrayDeque<>();
        for(Character e:x.toCharArray()) dq.add(e);
        sc.close();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='R'){
                dq.add('1');
            }else if(s.charAt(i)=='L'){
                dq.add('0');
            }else{
                dq.removeLast();
            }
        }
        String ans = "";
        for(Character e:dq) ans += e;
        System.out.println(Long.parseLong(ans,2));
    }
}
