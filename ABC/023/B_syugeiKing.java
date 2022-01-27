import java.util.Scanner;

public class B_syugeiKing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();
        if(n%2==0){
            System.out.println(-1);
            return;
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)!='a' && s.charAt(i)!='b' &&s.charAt(i)!='c'){
                System.out.println(-1);
                return;
            }
        }
        int cnt=0;
        while(s.length()>1){
            if((s.charAt(0)=='a'&&s.charAt(s.length()-1)=='c') || s.charAt(0)=='c'&&s.charAt(s.length()-1)=='a' || s.charAt(0)=='b'&&s.charAt(s.length()-1)=='b'){
                s = s.substring(1,s.length()-1);
                //System.out.println(s);
                cnt++;
            }else{
                cnt = -1;
                break;
            }
        }
        System.out.println(cnt);
    }
}
