import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D_RestrictedPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        //List of directed graph
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<Integer>());
        }

        for(int i=0;i<m;i++){
            int in = Integer.parseInt(sc.next())-1;
            int out = Integer.parseInt(sc.next())-1;
            list.get(in).add(out);
        }
        sc.close();
        System.out.println("list "+list);
        
        //To count the in degree
        int[] zeroDigit = new int[n];
        
        for(int i=0;i<n;i++){
            List<Integer> tmp = list.get(i);
            
            for(int node:tmp){
                zeroDigit[node]++;
            }
        }
        System.out.println("zeroDigit "+ Arrays.toString(zeroDigit));
        if(!around(zeroDigit)){
            System.out.println(-1);
            return;
        }

        ArrayDeque<Integer> q = new ArrayDeque<>();
        for(int i=0;i<n;i++){
            if(zeroDigit[i]==0){
                q.add(i);
            }
        }
        System.out.println("q "+q);
        List<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()){

            int u =q.removeFirst();

            ans.add(u);
            
            for(int node: list.get(u)){
                zeroDigit[node]--;
                if(zeroDigit[node]==0){
                    q.addFirst(node);
                }
            }
        }
        if(ans.isEmpty())System.out.println(-1);
        for(int element:ans){
            System.out.print(element+1+" ");
        }
    }
    public static boolean around(int[] arr){
        for(int e:arr){
            if(e==0)return true;
        }
        return false;
    }
}
