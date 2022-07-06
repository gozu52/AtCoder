import java.util.*;

public class B_1DPawn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt(), q = sc.nextInt();
        int[] a = new int[k];
        for(int i=0;i<k;i++)a[i] = sc.nextInt();
        int[] l = new int[q];
        for(int i=0;i<q;i++){
            l[i]=sc.nextInt()-1;
        }
        sc.close();
        int[] map = new int[n+1];
        for(int i=0;i<k;i++){
            map[a[i]]++;
        }
        for(int i=0;i<q;i++){
            if(a[l[i]]==n){
                continue;
            }
            if(map[a[l[i]]+1]==0){
                map[a[l[i]]+1] = map[a[l[i]]];
                map[a[l[i]]] = 0;
                a[l[i]]++;
            }
        }
        for(int i=0;i<=n;i++){
            if(map[i]!=0)System.out.print(i+" ");
        }
        
    }
}
