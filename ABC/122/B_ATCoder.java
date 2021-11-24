import java.util.Scanner;

public class B_ATCoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String[] arr = s.split("");
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            int tmp = 0;
            for(int j=i;j<arr.length;j++){
                if(!(arr[j].equals("A")||arr[j].equals("C")||arr[j].equals("G")||arr[j].equals("T"))){
                    break;
                }
                tmp++;
            }
            ans = Math.max(ans, tmp);
        }
        System.out.println(ans);
    }
}
