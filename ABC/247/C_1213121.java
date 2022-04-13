import java.util.*;

public class C_1213121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String tmp = sFunc(n);
        String [] ans = tmp.split("");
        for(int i=0;i<ans.length;i++){
            if(ans[i].equals("a")) ans[i] = "10";
            else if(ans[i].equals("b")) ans[i] = "11";
            else if(ans[i].equals("c")) ans[i] = "12";
            else if(ans[i].equals("d")) ans[i] = "13";
            else if(ans[i].equals("e")) ans[i] = "14";
            else if(ans[i].equals("f")) ans[i] = "15";
            else if(ans[i].equals("g")) ans[i] = "16";
            System.out.print(ans[i]+" ");
        }
    }
    static String sFunc(int n){
        String s ="";
        if(n==1)return "1";
        else if(n<10){
            s = sFunc(n-1) + String.valueOf(n) + sFunc(n-1);
        }else if(n==10){
            s = sFunc(n-1) + "a" + sFunc(n-1);
        }else if(n==11){
            s = sFunc(n-1) + "b" + sFunc(n-1);
        }else if(n==12){
            s = sFunc(n-1) + "c" + sFunc(n-1);
        }else if(n==13){
            s = sFunc(n-1) + "d" + sFunc(n-1);
        }else if(n==14){
            s = sFunc(n-1) + "e" + sFunc(n-1);
        }else if(n==15){
            s = sFunc(n-1) + "f" + sFunc(n-1);
        }else if(n==16){
            s = sFunc(n-1) + "g" + sFunc(n-1);
        }
        return s;
    }
}
