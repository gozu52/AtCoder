import java.util.*;

public class D_LinearProbing {
    static final int n = 1<<20;
    static long a[] = new long[n];
    static int p[] = new int[n];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = Integer.parseInt(sc.next());
        Arrays.fill(a, -1);
        for(int i=0;i<n;i++){
            p[i] = i+1;
        }
        p[n-1]=0;
        while(q-->0){
            int t = Integer.parseInt(sc.next());
            long x = Long.parseLong(sc.next());
            //still couldn't realize after this line
            if(t==1){
                int i= find((int)(x%n));
                a[i]=x;
            }else{
                System.out.println(a[(int)(x%n)]);
            }
        }
        sc.close();
        System.out.println();
        System.out.println(Arrays.toString(a));
        
    }
    public static int find(int i){
        return a[i] == -1 ? i : (p[i] = find(p[i]));
    }
	
}
