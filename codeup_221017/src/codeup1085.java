import java.util.Scanner;

public class codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long h = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long s = sc.nextInt();

        double result = h*b*c*s;
        result = result/8/1024/1024;
        System.out.printf("%.1f MB",result);
    }
}
