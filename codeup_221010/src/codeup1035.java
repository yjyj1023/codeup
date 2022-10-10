import java.util.Scanner;

public class codeup1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int s2 = Integer.parseInt(s,16);

        System.out.println(Integer.toString(s2,8));
    }
}
