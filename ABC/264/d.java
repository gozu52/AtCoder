import java.util.*;

public class d {
    final static int MOD = 998244353;
    static char[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arr = sc.next().toCharArray();
        sc.close();
        char[] str = "atcoder".toCharArray();
        long cnt = 0;
        for(int i=0;i<str.length;i++){
            for(int j=0;j<arr.length;j++){
                if(str[i]==arr[j]){
                    if(i==j)continue;
                    while(i!=j){
                        swap(j);
                        j--;
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
    static void swap(int num){
        char tmp = arr[num];
        arr[num] = arr[num-1];
        arr[num-1] = tmp;
    }
}
