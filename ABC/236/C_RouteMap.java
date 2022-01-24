import java.util.*;

public class C_RouteMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        Queue<String> ques = new ArrayDeque<>();
        for(int i=0;i<n;i++)ques.add(sc.next());
        Queue<String> quet = new ArrayDeque<>();
        for(int i=0;i<m;i++)quet.add(sc.next());
        sc.close();
        StringBuilder sb = new StringBuilder();
        sb.append("Yes"+"\n");
        ques.poll();quet.poll();
        for(String e:ques){
            if(quet.peek().equals(e)){
                sb.append("Yes"+"\n");
                ques.poll();quet.poll();
            }else{
                sb.append("No"+"\n");
                ques.poll();
            }
        }
        System.out.println(sb);
    }   
}
