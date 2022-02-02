import java.util.Scanner;

public class B_log {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        System.out.println(n-search(n)+1);
    }
    static long search(long num){
        long left =1, right = num+1, cnt = 0;
        while(left<=right){
            right -= left;
            left++;cnt++;
        }
        return cnt;
    }
}
