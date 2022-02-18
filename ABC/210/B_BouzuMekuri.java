import java.util.Scanner;

public class B_BouzuMekuri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String[] strs = s.split("");
        int count =0;
        for(int i=0;i<n;i++){
            if(strs[i].equals("1")){
                break;
            }else{
                count +=1;
            }
        }
        if(count%2==0){
            System.out.println("Takahashi");
        }else{
            System.out.println("Aoki");
        }
        sc.close();
    }
}