import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        String strn = Long.toBinaryString(n);
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<strn.length();i++){
            if(strn.charAt(i)=='1')set.add(i);
        }
        int cnt =  set.size();
        int[] arr = new int[cnt];
        int[] stcnt = new int[cnt];
        int tmpcnt = 0;
        for(int e: set){
            stcnt[tmpcnt] = e;
            tmpcnt++;
        }
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Long> que = new PriorityQueue<>();
        sb.append(strn);   
        for(int i=0;i<(1<<cnt);i++){
            for(int j=0;j<cnt;j++)arr[j] = 0;
            for(int j=0;j<cnt;j++){
                if((1&i>>j)==1){
                    arr[j] = 1;
                }
            }
            for(int j=0;j<cnt;j++){
                if(arr[j]==1)sb.replace(stcnt[j],stcnt[j]+1,"1");
                else sb.replace(stcnt[j],stcnt[j]+1,"0");
            }
            long ele = Long.parseLong(sb.toString(),2);
            que.add(ele);
        }
        while(!que.isEmpty()){
            System.out.println(que.poll());
        }
    }
}
