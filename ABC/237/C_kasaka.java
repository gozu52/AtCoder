import java.util.*;

public class C_kasaka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        int cntFront = countFront(s);
        int cntBack = countBack(s);
        if(cntFront==s.length()){
            System.out.println("Yes");
            return;
        }else if(cntFront>cntBack){
            System.out.println("No");
            return;
        }
        if(!isPalindrome(s, cntFront, cntBack)){
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
    static boolean isPalindrome(String s,int num1, int num2){
        for(int i=num1;i<(s.length()-num2);i++){
			if(s.charAt(i)!=s.charAt(num1+s.length()-num2-i-1)){
				return false;
			}
		}
        return true;
    }
    static int countBack(String s){
        int cnt = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='a')cnt++;
            else break;
        }
        return cnt;
    }
    static int countFront(String s){
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a')cnt++;
            else break;
        }
        return cnt;
    }
}
