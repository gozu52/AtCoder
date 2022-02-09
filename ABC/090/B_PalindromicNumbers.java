import java.util.Scanner;

public class B_PalindromicNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        sc.close();
        int cnt = 0;
        for(int i=a;i<=b;i++){
            if(solve(i))cnt++;
        }
        System.out.println(cnt);
    }
    static boolean solve(int n){
        String str = String.valueOf(n);
        int left = 0, right = str.length()-1;
        while(right>left){
            if(str.charAt(left)!=str.charAt(right))return false;
            left++;right--;
        }
        return true;
    }
}
