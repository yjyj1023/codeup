import java.util.Scanner;

public class codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextInt();
        long m = sc.nextInt();
        long d = sc.nextInt();
        long n = sc.nextInt();

        long result = a;
        long temp = 1;
        while(temp != n){
            result = result*m+d;
            temp++;
        }

        System.out.println(result);
    }
}
