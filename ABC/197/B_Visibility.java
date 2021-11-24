import java.util.*;

public class B_Visibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = Integer.parseInt(sc.next());
        int w = Integer.parseInt(sc.next());
        int x = Integer.parseInt(sc.next());
        int y = Integer.parseInt(sc.next());
        String mass[][] = new String[h][w];
        for(int i=0;i<h;i++){
            String tmp = sc.next();
            mass[i] = tmp.split("");
        }
        sc.close();
        System.out.println(visible(x, y, mass, h, w));
    }
    public static int visible(int x,int y,String mass[][],int h, int w){
        int cnt =0;
        x -= 1; y-=1;
        //Fixing x
        for(int i=y;i<w;i++){
            if(mass[x][i].equals(".")){
                cnt++;
            }else{
                break;
            }
        }
        for(int i=y;i>=0;i--){
            if(mass[x][i].equals(".")){
                cnt++;
            }else{
                break;
            }
        }
        //Fixing y
        for(int i=x;i<h;i++){
            if(mass[i][y].equals(".")){
                cnt++;
            }else{
                break;
            }
        }
        for(int i=x;i>=0;i--){
            if(mass[i][y].equals(".")){
                cnt++;
            }else{
                break;
            }
        }
        return cnt-3;
    }
}
