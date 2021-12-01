import java.util.*;
 
public class D_LongestX {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int k = Integer.parseInt(sc.next());
        sc.close();
        String[] arrs= s.split("");
        //Cumulative Sum
        int[] sum = new int[s.length()+1];
        sum[0] = 0;
        for(int i=0;i<s.length();i++){
            if(arrs[i].equals("."))sum[i+1]++;
            sum[i+1]+=sum[i];
        }
        int ans = 0,right = 0;
        //Looper Methods
        for(int left=0;left<s.length();left++){
            while(right<s.length() && sum[right+1]-sum[left]<=k){
                right++;
            }
            ans = Math.max(ans, right-left);
        }
        System.out.println(ans);
    }
    
}
