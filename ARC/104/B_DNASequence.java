import java.util.Scanner;

public class B_DNASequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();
        int ans =0;        
        for(int i=0;i<n;i++){
            int cntA = 0, cntC =0;
            for(int j=i;j<n;j++){
                if(s.charAt(j)=='A')cntA++;
                if(s.charAt(j)=='T')cntA--;
                if(s.charAt(j)=='C')cntC++;
                if(s.charAt(j)=='G')cntC--;
                if(cntA==0&&cntC==0)ans++;
            }
        }
        System.out.println(ans);
    }
}
