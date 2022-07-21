import java.util.*;

public class B_BetterStudentsAreNeeded {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), x = sc.nextInt(), y = sc.nextInt(), z = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        for(int i=0;i<n;i++)a[i] = sc.nextInt();
        for(int i=0;i<n;i++)b[i] = sc.nextInt();
        sc.close();
        List<Integer> al = new ArrayList<Integer>();
        int[] math = a.clone();
        int[] eng = b.clone();
        Arrays.sort(math);
        Arrays.sort(eng);
        int cntmath = 0, cnteng = 0, cntsum = 0;
        for(int i=n-1;i>=0;i--){
            if(x==0)break;
            for(int j=0;j<n;j++){
                if(a[j]==math[i]&&!al.contains(j)){
                    al.add(j);cntmath++;
                    break;
                }
            }
            if(cntmath==x)break;
        }
        for(int i=n-1;i>=0;i--){
            if(y==0)break;
            for(int j=0;j<n;j++){
                if(b[j]==eng[i]&&!al.contains(j)){
                    al.add(j);cnteng++;
                    break;
                }
            }
            if(cnteng==y)break;
        }
        int[] sum = new int[n];
        for(int i=0;i<n;i++)sum[i] = a[i]+b[i];
        Arrays.sort(sum);
        for(int i=n-1;i>=0;i--){
            if(z==0)break;
            for(int j=0;j<n;j++){
                if(a[j]+b[j]==sum[i]&&!al.contains(j)){
                    al.add(j);cntsum++;
                    break;
                }
            }
            if(cntsum==z)break;
        }
        Collections.sort(al);
        for(int i=0;i<al.size();i++)System.out.print(al.get(i)+1+" ");
    }
}
