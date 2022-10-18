import java.util.Scanner;

public class codeup1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0;
        int temp = 0;
        while(num>result){
            result+=temp;
            temp++;
        }

        System.out.println(result);
    }
}
