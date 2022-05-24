import java.util.*;

public class C_SlotStrategy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++)s[i] = sc.next();
        sc.close();
        long[] tmp = new long[10];
        int[][] cnt = new int[10][10];
        for(int i=0;i<n;i++)for(int j=0;j<s[i].length();j++)cnt[s[i].charAt(j)-'0'][j]++;
        for(int i=0;i<10;i++){
            Set<Integer> set = new HashSet<Integer>();
            for(int j=0;j<n;j++){
                tmp[i] = Math.max(s[j].indexOf(String.valueOf(i)),tmp[i]);
                set.add(s[j].indexOf(String.valueOf(i)));
            }
            int sub = -1;
            for(int j=0;j<10;j++){
                if(cnt[i][j]>1 && sub<=cnt[i][j]){
                    tmp[i] = (cnt[i][j]-1)*10+j;
                    sub = cnt[i][j];
                }
            }
        }
        Arrays.sort(tmp);
        System.out.println(tmp[0]);
    }
}

