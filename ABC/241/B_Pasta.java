import java.util.*;

public class B_Pasta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        List<Integer> a = new ArrayList<Integer>();
        int[] b = new int[m];
        for(int i=0;i<n;i++)a.add(sc.nextInt());
        for(int i=0;i<m;i++)b[i]=sc.nextInt();
        sc.close();
        for(int i=0;i<m;i++){
            if(a.contains(b[i])){
                a.remove(a.indexOf(b[i]));
            }else{
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
