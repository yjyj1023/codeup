import java.util.Scanner;

public class codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String[] Arr = str.split("\\.");

        System.out.println(Arr[0]+'\n'+Arr[1]);


    }
}
