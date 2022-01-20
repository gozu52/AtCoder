package MathAlgo.Chapter3;

import java.util.*;

public class q014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        sc.close();
        for(long e:factrization(num))System.out.print(e+" ");
    }
    public static List<Long> factrization(long num){
        List<Long> list = new ArrayList<>();

        for(long i=2;i*i<=num;i++){
            while(num%i==0){
                list.add(i);
                num /= i;
            }
        }
        if(num>=2)list.add(num);
        return list;
    }
}
