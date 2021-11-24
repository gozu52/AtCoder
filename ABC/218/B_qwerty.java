import java.util.Scanner;

public class B_qwerty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] p = new int[26];
        for(int i=0;i<26;i++){
            p[i]=Integer.parseInt(sc.next());
        }
        sc.close();
        char[] ans = new char[26];
        for(int i=0;i<26;i++){
            char temp =(char)(p[i]+96);
            ans[i]=temp;
            System.out.print(ans[i]);
        }
        
    }
}