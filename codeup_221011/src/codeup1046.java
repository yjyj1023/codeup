import java.util.Scanner;

public class codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println(num1+num2+num3);
        System.out.printf("%.1f",(double)(num1+num2+num3)/(double)3);
    }

}
