import java.util.*;

public class C_AdjacentSwaps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), q = sc.nextInt();
        int[] arr = new int[n+1], map = new int[n+1];
        arr[0] = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){arr[i] = i;map[i] = i;}
        while(q-- > 0){
            int x = sc.nextInt();
            swap(arr, map, x);
        }
        sc.close();
        for(int i=1;i<=n;i++)System.out.print(arr[i]+" ");
    }
    static void swap(int[] arr,int[] map, int x){
        int n = arr.length-1;
        int pos = map[x];
        int next = pos==n ? pos-1 : pos+1;
        int nextPos = arr[next];
        map[x] = next; map[nextPos] = pos;
        arr[pos] = nextPos; arr[next] = x;
    }
}
