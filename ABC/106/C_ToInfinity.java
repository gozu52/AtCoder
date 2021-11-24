import java.util.Scanner;

public class C_ToInfinity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long k = sc.nextLong();
        int count = 1;
        sc.close();

        String[] temp = s.split("");

        for (int i = 0; i < s.length(); i++) {
            if (temp[i].equals("1") && count == k) {
                System.out.println(1);
                return;
            } else if (temp[i].equals("1") && k != count) {
                count += 1;
            } else {
                System.out.println(temp[i]);
                return;
            }
        }

    }
}
