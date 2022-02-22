import java.util.*;

public class A_HAGIXILE {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		if(str.contains("HAGIYA")){
			str = str.replace("HAGIYA", "HAGIXILE");
		}
		System.out.println(str);
	}
}
