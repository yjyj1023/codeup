import java.util.Scanner;

public class codeup1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if(num2>=num1){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
