import java.util.*;

public class D_Neighbors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        boolean flag = true;
        LinkedList<Integer> queue = new LinkedList<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        int[] neighbor = new int[n];

        //list to manage neighbors
        for(int i=0;i<n;i++)list.add(new ArrayList<>());

        for(int i=0;i<m;i++){
            int a = Integer.parseInt(sc.next())-1;
            int b = Integer.parseInt(sc.next())-1;
            neighbor[a]++;
            neighbor[b]++;
            list.get(a).add(b);
            list.get(b).add(a);
        }
        sc.close();
        System.out.println(Arrays.toString(neighbor));

        /*
        / classification of cases
        / neighbor[i]>2 -> invalid
        / neighbor[i]<2 -> to verify less than or equal to one constraint
        */
        for(int i=0;i<n;i++){
            if(neighbor[i]>2)flag = false;
            if(neighbor[i]<2)queue.add(i);
        }

        /*
        / set -> determine if all the items are used as they are listed in row
        */
        while(!queue.isEmpty()){
            int p = queue.poll();
            set.add(p);
            for(int e : list.get(p)){
                neighbor[e]--;
                if(neighbor[e]==1)queue.offer(e);
            }
        }
        System.out.println(set.size()==n && flag ? "Yes" : "No");
    }
}
