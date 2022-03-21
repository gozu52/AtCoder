import java.util.*;

public class B_GoStraightAndTurnRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] t = sc.next().toCharArray();
        sc.close();
        int x = 0 , y = 0;
        char hougaku = 'E';
        for(int i=0;i<n;i++){
            if(t[i]=='S'){
                if(hougaku=='E'){
                    x++;
                }if(hougaku=='N'){
                    y++;
                }if(hougaku=='W'){
                    x--;
                }if(hougaku=='S'){
                    y--;
                }
            }else{
                if(hougaku=='E'){
                    hougaku = 'S';
                }else if(hougaku=='N'){
                    hougaku = 'E';
                }else if(hougaku=='W'){
                    hougaku = 'N';
                }else if(hougaku=='S'){
                    hougaku = 'W';
                }
            }
        }
        System.out.println(x+" "+y);
    }
}
