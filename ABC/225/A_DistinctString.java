import java.util.*;

public class A_DistinctString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String[] sarr = s.split("");
        int cnt = 0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i==j)continue;
                if(sarr[i].equals(sarr[j]))cnt++;
            }
        }
        if(cnt == 0){
            System.out.println(6);
        }else if(cnt == 6){
            System.out.println(1);
        }else{
            System.out.println(3);
        }
    }
}
