import java.util.Scanner;

public class B_TollGates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int[] a = new int[m];
        for(int i=0;i<m;i++){
            a[i]=Integer.parseInt(sc.next());
        }
        sc.close();
        int count1 =0;
        int count2=0;
        for(int i=x+1;i<n+1;i++){
            for(int j=0;j<m;j++){
                if(i==a[j]){
                    count1+=1;
                }
            }
        }
        for(int i=x-1;i>-1;i--){
            for(int j=0;j<m;j++){
                if(i==a[j]){
                    count2+=1;
                }
            }
        }

        if(count1<=count2){
            System.out.println(count1);
        }else{
            System.out.println(count2);
        }
    }
}
