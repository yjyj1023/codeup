import java.util.Scanner;

public class codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;
        int temp = 0;

        while(num>sum){
            temp++;
            sum += temp;

        }
        System.out.println(temp);
    }

}
