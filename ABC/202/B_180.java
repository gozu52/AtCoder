import java.util.Scanner;

public class B_180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String s_arr[]=s.split("");
        for(int i=0;i<s.length();i++){
            if(s_arr[i].equals("6")){
                s_arr[i] = "9";
            }else if(s_arr[i].equals("9")){
                s_arr[i] = "6";
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            System.out.print(s_arr[i]);
        }
    }
}
