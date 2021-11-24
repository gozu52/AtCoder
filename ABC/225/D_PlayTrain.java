import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class D_PlayTrain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int q = Integer.parseInt(sc.next());
        //to manage front and back node 
        //hard to take into account the deviation of 0 -> +1
        int[] front = new int[n+1];
        int[] back = new int[n+1];
        StringBuilder ans = new StringBuilder();

        //Since the input size of each is different, the case is divided by the first value
        for(int i=0;i<q;i++){
            int process = Integer.parseInt(sc.next());
            int x = Integer.parseInt(sc.next());
            if(process!=3){
                int y = Integer.parseInt(sc.next());
                if(process==1){
                    front[y] = x;
                    back[x] = y;
                }else {
                    //node process == 2
                    front[y] = 0;
                    back[x] = 0;
                }
            }else{
                //node process == 3
                int point = x;
                //to start with something that doesn't have a lead
                while(front[point]!=0){
                    point = front[point];
                }
                //a list to temporarily store values
                List<Integer> list = new ArrayList<>();
                list.add(point);
                while(back[point]!=0){
                    point = back[point];
                    list.add(point);
                }
                //after the list is completed, store it to ans to output its values together
                ans.append(list.size()).append(' ');
                //if you add the contents of the list as is ,[,] will be added
                for(int e: list){
                    ans.append(e).append(' ');
                }
                ans.append('\n');
            }
        }
        sc.close();
        System.out.println(Arrays.toString(front));
        System.out.println(Arrays.toString(back));
        //delete one too many line breaks
        ans.deleteCharAt(ans.length()-1);
        System.out.println(ans);
    }
}
