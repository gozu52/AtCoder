import java.util.*;

public class A_FirstGrid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        sc.close();
        String[] arr1 = s1.split("");
        String[] arr2 = s2.split("");
        int cnt = 0;
        int cnt1 =0;
        int cnt2 = 0;
        for(int i=0;i<s1.length();i++){
            if(arr1[i].equals("#"))cnt1++;
        }
        for(int i=0;i<s2.length();i++){
            if(arr2[i].equals("#"))cnt2++;
        }
        cnt = cnt1 + cnt2;
        boolean flag = false;
        if(cnt>2 || cnt1>=2 || cnt2>=2)flag = true;
        if(cnt ==2){
            for(int i=0;i<s1.length();i++){
                if(arr1[i].equals("#")&& arr2[i].equals("#"))flag = true;
            }
        }
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}