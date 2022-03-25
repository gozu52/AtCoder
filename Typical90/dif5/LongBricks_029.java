import java.util.*;

public class LongBricks_029 {
    //解説AC
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt(), n = sc.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        StringBuilder sb = new StringBuilder();
        map.put(0, 0);
        map.put(w+1, 0);
        for(int i=0;i<n;i++){
            int left = sc.nextInt();int right = sc.nextInt();
            int key = map.floorKey(left);
            int value = map.get(key);
            int max = value;
            while ((key = map.higherKey(key)) <= right) {
                value = map.get(key);
                max = Math.max(max, value);
                map.remove(key);
            }
            sb.append(max + 1).append("\n");
            map.put(left, max + 1);
            if (!map.containsKey(right + 1)) {
                map.put(right + 1, value);
            }
        }
        sc.close();
        System.out.print(sb);
    }
}
