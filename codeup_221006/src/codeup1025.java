import java.util.Scanner;

public class codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("["+num/10000 * 10000+"]");
        num = num%10000;

        System.out.println("["+num/1000 * 1000+"]");
        num = num%1000;

        System.out.println("["+num/100 * 100+"]");
        num = num%100;

        System.out.println("["+num/10 * 10+"]");
        num = num%10;

        System.out.println("["+num+"]");
    }
}

