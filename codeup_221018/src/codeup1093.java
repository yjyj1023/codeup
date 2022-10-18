import java.util.Scanner;

public class codeup1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] result = new int[23];
        for(int i = 0; i<result.length; i++){
            result[i] = 0;
        }

        int num = sc.nextInt();

        for(int i = 0; i<num; i++){
            int a = sc.nextInt();
            result[a-1] += 1;
        }

        for(int a:result){
            System.out.print(a+" ");
        }



    }
}
