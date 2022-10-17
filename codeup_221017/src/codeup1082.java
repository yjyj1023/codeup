import java.util.Scanner;

public class codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String num = sc.next();
        int num_dex = Integer.parseInt(num, 16);

        for(int i = 1; i<=15; i++){
            System.out.printf("%s*%X=%X\n",num,i,i*num_dex);
        }
    }

}
