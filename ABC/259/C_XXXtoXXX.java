import java.util.*;

public class C_XXXtoXXX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(), t = sc.next();
        sc.close();
        Deque<String> dqs = new ArrayDeque<>();
        for(int i=0;i<s.length();i++){
            long cnt = 1;
            while(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)){
                cnt++;
                i++;
            }
            dqs.add(String.valueOf(cnt));
            dqs.add(""+s.charAt(i));
        }
        Deque<String> dqt = new ArrayDeque<>();
        for(int i=0;i<t.length();i++){
            long cnt = 1;
            while(i+1<t.length()&&t.charAt(i)==t.charAt(i+1)){
                cnt++;
                i++;
            }
            dqt.add(String.valueOf(cnt));
            dqt.add(""+t.charAt(i));
        }
        while(!dqs.isEmpty()&&!dqt.isEmpty()){
            String s1 = dqs.pollFirst(), s2 = dqs.pollFirst();
            String t1 = dqt.pollFirst(), t2 = dqt.pollFirst();
            if(s2.equals(t2)){
                if(s1.equals(t1)){
                    continue;
                }
                if(Long.parseLong(s1)==Long.parseLong(t1)){
                    continue;
                }else if(!(Long.parseLong(s1)<=Long.parseLong(t1)&&Long.parseLong(s1)>=2)){
                    System.out.println("No");
                    return;
                }
            }
            if(!s2.equals(t2)){
                System.out.println("No");
                return;
            }
        }
        if(dqs.isEmpty()&&dqt.isEmpty()){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
