import java.util.*;

public class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        String hex = Integer.toHexString(n);
        if(hex.length()==1)hex = "0"+hex;
        hex = hex.replace("a", "A");
        hex = hex.replace("b", "B");
        hex = hex.replace("c", "C");
        hex = hex.replace("d", "D");
        hex = hex.replace("e", "E");
        hex = hex.replace("f", "F");
        System.out.println(hex);
    }
}