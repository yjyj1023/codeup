import java.util.Scanner;

public class codeup1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(num1*(int)Math.pow(2, num2));

    }
}
