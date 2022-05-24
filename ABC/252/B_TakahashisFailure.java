import java.util.*;

public class B_TakahashisFailure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        int[] b = new int[k];
        for(int i=0;i<k;i++)b[i] = sc.nextInt();
        sc.close();
        int[] tmp = new int[n];
        for(int i=0;i<n;i++)tmp[i] = a[i];
        Arrays.sort(tmp);
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(tmp[n-1]==a[i])list.add(i+1);
        }
        for(int i=0;i<k;i++){
            if(list.contains(b[i])){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
