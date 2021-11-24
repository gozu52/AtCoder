import java.util.*;

public class C_MartialArtist1 {
	public static void main(String[] args){
        //Finished version sloved after finifhing the contest
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        //use it later, so initializing long
		long[] t = new long[n];
		HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
		for ( int i=0; i<n; i++ ) {
			t[i] = sc.nextLong();
            //k is only used to determine the number of a[i], so it is recieved locally.
			int k = sc.nextInt();
			HashSet<Integer> set = new HashSet<>();
			for ( int j=0; j<k; j++ ) {
                //adjusting the gap between i
				int a = sc.nextInt()-1;
				set.add(a);
			}
            //if you don't need to learn the technique beforehand, I don't need to follow it any futher, so don't add it.
			if ( !set.isEmpty() ) {
				map.put(i, set);
			}
		}
        System.out.println("m " + map);
        sc.close();
        System.out.println(dag(n, map, t));
	}
    public static long dag(int n,HashMap<Integer, HashSet<Integer>> map,long[] t){
        long ans =0;
        long[] dag = new long[n];
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.addLast(n-1);
        while(q.size()>0){
            int tmp = q.removeFirst();
            //set the traced part to 1
            dag[tmp] = 1;
            if(map.containsKey(tmp)){
                HashSet<Integer> set = map.get(tmp);
                for(int e: set){
                    if(dag[e]==0){
                        q.addLast(e);
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            ans += t[i]*dag[i];
        }
        return ans;
    }
}
