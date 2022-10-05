import java.util.Scanner;

public class codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String[] s2 = s.split("-");

        System.out.printf("%06d%07d",Integer.parseInt(s2[0]),Integer.parseInt(s2[1]));
    }
}
