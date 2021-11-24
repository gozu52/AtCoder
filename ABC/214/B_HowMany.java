import java.util.Scanner;

public class B_HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = Integer.parseInt(sc.next());
        int t = Integer.parseInt(sc.next());
        sc.close();
        int count =0;
        for(int i=0;i<=s;i++){
            for(int j=0;i+j<=s;j++){
                for(int k=0;i+j+k<=s;k++){
                    if(i*j*k<=t){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
