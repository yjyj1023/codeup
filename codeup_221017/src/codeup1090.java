import java.util.Scanner;

public class codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long r = sc.nextInt();
        long n = sc.nextInt();

        System.out.println(a*(long)Math.pow(r, n-1));
    }
}
