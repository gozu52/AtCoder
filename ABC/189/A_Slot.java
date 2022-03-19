import java.util.*;

public class A_Slot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] s = sc.next().toCharArray();
        sc.close();
        for(int i=0;i<3;i++){
            for(int j=i+1;j<3;j++){
                if(s[i] != s[j]){System.out.println("Lost");return;}
            }
            
        }
        System.out.println("Won");
    }
}
