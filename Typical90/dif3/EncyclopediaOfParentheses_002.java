import java.util.*;

public class EncyclopediaOfParentheses_002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        char[] p = paren(n);
        do{
            if(check(p))System.out.println(p);
        }while(nextPermutation(p));

    }
    static char[] paren(int n){
        char[] p = new char[n];
        for(int i=0;i<n/2;i++)p[i]='(';
        for(int i=n/2;i<n;i++)p[i]=')';
        return p;
    }
    static boolean check(char[] p){
        int left = 0, right = 0;
        for(int i=0;i<p.length;i++){
            if(p[i]=='(')left++;
            else right++;
            if(left<right)return false;
        }
        return true;
    }
    static boolean nextPermutation(char[] arr) {
        int len = arr.length;
        int left = len - 2;
        while (left >= 0 && arr[left] >= arr[left+1]) left--;
        if (left < 0) return false;
        int right = len - 1;
        while (arr[left] >= arr[right]) right--;
        { char t = arr[left]; arr[left] = arr[right];  arr[right] = t; }
        left++;
        right = len - 1;
        while (left < right) {
          { char t = arr[left]; arr[left] = arr[right]; arr[right] = t; }
          left++;
          right--;
        }
        return true;
    }
}
