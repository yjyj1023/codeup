import java.util.Scanner;

public class codeup1033 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String a = Integer.toString(num,16).toUpperCase();

        System.out.println(a);
    }
}
