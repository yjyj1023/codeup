import java.util.Scanner;

public class codeup1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] s2 = s.split(":");

        System.out.printf(s2[0]+":"+s2[1]);
    }
}
