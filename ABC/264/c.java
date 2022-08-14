import java.util.*;

public class c {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt(), w1 = sc.nextInt();
        int[][] a = new int[h1][w1];
        String[] arr = new String[h1];
        for(int i=0;i<h1;i++){
            String tmp = "";
            for(int j=0;j<w1;j++){
                a[i][j] = sc.nextInt();
                tmp += String .valueOf(a[i][j]);
            }
            arr[i] = tmp;
        }
        int h2 = sc.nextInt(), w2 = sc.nextInt();
        int[][] b = new int[h2][w2];
        String[] brr = new String[h2];
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<h2;i++){
            String tmp = "";
            for(int j=0;j<w2;j++){
                b[i][j] = sc.nextInt();
                tmp += String.valueOf(b[i][j]);
                list.add(b[i][j]);
            }
            brr[i] = tmp;
        }
        sc.close();
        if(h1==h2 && w1==w2){
            for(int i=0;i<h1;i++){
                for(int j=0;j<w1;j++){
                    if(a[i][j]!=b[i][j]){
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        if(h1<h2 || w1<w2){
            System.out.println("No");
            return;
        }
        Deque<Integer> qw = new ArrayDeque<>();
        Deque<Integer> qh = new ArrayDeque<>();
        for(int i=0,i2=0;i<h1&&i2<h2;i++){
            int wcnt = 0;
            for(int j1=0,j2=0;j1<w1&&j2<w2;j1++){
                if(a[i][j1]==b[i2][j2]){
                    wcnt++;
                    j2++;
                }
            }
            if(wcnt!=w2){
                continue;
            }else{
                qw.add(i);
                i2++;
            }
        }
        for(int i=0,i2=0;i<w1&&i2<w2;i++){
            int hcnt= 0;
            for(int j1=0,j2=0;j1<h1&&j2<h2;j1++){
                if(a[j1][i]==b[j2][i2]){
                    hcnt++;
                    j2++;
                }
            }
            if(hcnt!=h2){
                continue;
            }else{
                qh.add(i);
                i2++;
            }
        }
        if(qw.size()!=h2 || qh.size()!=w2){
            System.out.println("No");
            return;
        }else{
            System.out.println("Yes");
        }
    }
}
