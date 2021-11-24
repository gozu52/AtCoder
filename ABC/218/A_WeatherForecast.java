import java.util.Scanner;

public class A_WeatherForecast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        String s = sc.next();
        sc.close();
        String[] weather = s.split("");
        if(weather[n-1].equals("o"))System.out.println("Yes");
        else System.out.println("No");
    }
}
