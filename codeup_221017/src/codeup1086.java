import java.util.Scanner;

public class codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long w = sc.nextInt();
        long h = sc.nextInt();
        long b = sc.nextInt();

        double result = w*h*b;
        result = result/8/1024/1024;
        System.out.printf("%.2f MB",result);
    }
}
