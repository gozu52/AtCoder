import java.util.*;

public class C_KSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = sc.nextInt();
        sc.close();
        for(int i=0;i<k;i++){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=i;j<n;j+=k)list.add(a[j]);
            Collections.sort(list);
            int p = 0;
            for(int j=i;j<n;j+=k){
                a[j] = list.get(p);
                p++;
            }
        }
        System.out.println(arise(a)? "Yes" : "No");
    }
    static boolean arise(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]) return false;
        }
        return true;
    }
}
