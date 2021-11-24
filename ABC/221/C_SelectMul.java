import java.util.Arrays;
import java.util.Scanner;

public class  C_SelectMul {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        sc.close();
        String[] n_arr = n.split("");
        Arrays.sort(n_arr);
        String a = "";
        String b = "";
        int cnt =0;
        for(int i=n.length()-1;i>=0;i--){
            if(cnt%2==0){
                a += n_arr[i];
            }else{
                b += n_arr[i];
            }
            cnt++;
        }
        String[] tempA = a.split("");
        String[] tempB = b.split("");
        
        for(int i=0;i<Math.min(a.length(), b.length());i++){
            if(!tempA[i].equals(tempB[i])){
                String temp = tempA[i];
                tempA[i] = tempB[i];
                tempB[i] = temp;
                break;
            }
        }
        String ansA = "";
        String ansB = "";
        for(int i=0;i<a.length();i++){
            ansA+=tempA[i];
        }
        for(int i=0;i<b.length();i++){
            ansB+=tempB[i];
        }
        System.out.println(Integer.parseInt(ansA)* Integer.parseInt(ansB));

    }
}
