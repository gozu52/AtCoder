import java.util.Scanner;

public class B_RuinedSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2= sc.nextInt();
        sc.close();
        int xDis = (int)Math.abs(x1-x2);
        int yDis = (int)Math.abs(y1-y2);
        if(x2-x1>=0 && y2-y1>=0){
            System.out.println((x2-yDis)+" "+(y2+xDis)+" "+(x1-yDis)+" "+(y1+xDis));
        }else if(x2-x1>=0 && y2-y1<=0){
            System.out.println((x2+yDis)+" "+(y2+xDis)+" "+(x1+yDis)+" "+(y1+xDis));
        }else if(x2-x1<=0 && y2-y1<=0){
            System.out.println((x2+yDis)+" "+(y2-xDis)+" "+(x1+yDis)+" "+(y1-xDis));
        }else if(x2-x1<=0 && y2-y1>=0){
            System.out.println((x2-yDis)+" "+(y2-xDis)+" "+(x1-yDis)+" "+(y1-xDis));
        }
    }
}
