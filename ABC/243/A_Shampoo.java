import java.util.*;

public class A_Shampoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int[] a = new int[3];
        for(int i=0;i<3;i++)a[i] = sc.nextInt();
        sc.close();
        while(v>=0){
            for(int i=0;i<3;i++){
                v-=a[i];
                if(v<0){
                    if(i==0){System.out.println("F");return;}
                    else if(i==1){System.out.println("M");return;}
                    else {System.out.println("T");return;}
                }
            }
        }
    }
}
