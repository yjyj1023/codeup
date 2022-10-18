import java.util.Scanner;

public class codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char num = sc.next().charAt(0);

        for(char i = 'a'; i <= num; i++){
            System.out.print(i+" ");
        }
    }
}
