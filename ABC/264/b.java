import java.util.*;

public class b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt()-1, c = sc.nextInt()-1;
        sc.close();
        String[]  arr = new String[15];
        arr[0] ="***************";
        arr[1] ="*.............*";
        arr[2] ="*.***********.*";
        arr[3] ="*.*.........*.*";
        arr[4] ="*.*.*******.*.*";
        arr[5] ="*.*.*.....*.*.*";
        arr[6] ="*.*.*.***.*.*.*";
        arr[7] ="*.*.*.*.*.*.*.*";
        arr[8] ="*.*.*.***.*.*.*";
        arr[9] ="*.*.*.....*.*.*";
        arr[10]="*.*.*******.*.*";
        arr[11]="*.*.........*.*";
        arr[12]="*.***********.*";
        arr[13]="*.............*";
        arr[14]="***************";
        char[][] crr = new char[15][15];
        for(int i=0;i<15;i++){
            crr[i] = arr[i].toCharArray();
        }
        if(crr[r][c]=='*'){
            System.out.println("black");
        }
        else{
            System.out.println("white");
        }
    }
}
