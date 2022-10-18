import java.util.Scanner;

public class codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int min = sc.nextInt();

        for(int i = 0; i<num-1; i++){
            int temp = sc.nextInt();
            if(temp<min){
                min = temp;
            }
        }

        System.out.println(min);

    }
}
