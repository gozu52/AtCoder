package ABC.ABC150;

import java.util.*;

public class C_CountOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] q = new int[n];
        String strp = "";
        String strq = "";
        for(int i=0;i<n;i++)p[i] =sc.nextInt();
        for(int i=0;i<n;i++)q[i] = sc.nextInt();
        sc.close();
        for(int i=0;i<n;i++)strp += String.valueOf(p[i]);
        for(int i=0;i<n;i++)strq += String.valueOf(q[i]);
        int[] base = new int[n];
        for(int i=0;i<n;i++)base[i] = i+1;
        int cnt = 0, ansP = 0, ansQ = 0; 
        do{
            cnt++;
            String tmp = "";
            for(int i=0;i<n;i++)tmp += String.valueOf(base[i]);
            //System.out.println(tmp);
            if(tmp.equals(strp))ansP = cnt;
            if(tmp.equals(strq))ansQ = cnt;
        }while(nextPermutation(base));
        System.out.println(Math.abs(ansP-ansQ));

    }
    static boolean nextPermutation(int[] base){
        int len = base.length;
        int left = len-2;
        while(left>=0 && base[left]>=base[left+1])left--;
        if(left<0)return false;
        int right = len - 1;
        while (base[left] >= base[right]) right--;
        int t = base[left]; base[left] = base[right];  base[right] = t;
        left++;
        right = len - 1;
        while (left < right) {
        int tmp = base[left]; base[left] = base[right]; base[right] = tmp;
        left++;
        right--;
        }
        return true;
    }
}
