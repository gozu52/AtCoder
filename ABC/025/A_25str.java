import java.util.Scanner;

public class A_25str {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();
        sc.close();
        int cnt = 0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                cnt++;
                if(cnt==n){
                    System.out.println(String.valueOf(s.charAt(i))+String.valueOf(s.charAt(j)));
                    return;
                }
            }
        }
    }
}
