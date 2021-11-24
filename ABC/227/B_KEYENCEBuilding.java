import java.util.*;

public class B_KEYENCEBuilding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        long[] s = new long[n];
        for(int i=0;i<n;i++){
            s[i] = Long.parseLong(sc.next());
        }
        sc.close();

        HashSet<Long> set = new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=1;j<=s[i];j++){
                for(int k=1;k<=s[i];k++){
                    long top = 4*j*k;
                    long middle = 3*j;
                    long bottom = 3*k;
                    if(top + middle + bottom==s[i])set.add(s[i]);
                }
            }
        }

        int cnt2 = 0;
        for(int i=0;i<n;i++){
            for(Long e:set){
                if(s[i]==e)cnt2++;
            }
        }
        System.out.println(s.length-cnt2);
    }
}
