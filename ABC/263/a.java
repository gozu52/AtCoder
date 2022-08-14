import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[14];
        for(int i=0;i<5;i++){
            arr[sc.nextInt()]++;
        }
        sc.close();
        int three = 0, two = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==3){
                three++;
            }
            else if(arr[i]==2){
                two++;
            }
        }
        if(three>0&&two>0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}