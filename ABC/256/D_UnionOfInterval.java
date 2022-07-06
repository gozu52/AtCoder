import java.util.*;

public class D_UnionOfInterval {
    static int maxVal = 2*(int)Math.pow(10, 5);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] sum = new int[maxVal+5];
        TreeSet<Integer> set = new TreeSet<Integer>();
        for(int i=0;i<n;i++){
            int a = sc.nextInt(),b = sc.nextInt();
            set.add(a);set.add(b);
            sum[a]++;sum[b]--;
        }
        sc.close();
        for(int i=1;i<maxVal+5;i++)sum[i] += sum[i-1];
        int start = 0;
        StringBuilder sb = new StringBuilder();
        for(int e : set){
            if(start == 0)start = e;
            if(start != 0 && sum[e] == 0){
               sb.append(start+" "+e+"\n");
               start = 0; 
            }  
        }
        System.out.println(sb.toString());
    }
}
