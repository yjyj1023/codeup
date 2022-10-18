import java.util.Scanner;

public class codeup1096 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[19][19];
        for(int i = 0; i<19; i++){
            for(int j = 0; j<19; j++){
                arr[i][j] = 0;
            }
        }

        int num = sc.nextInt();
        for(int i = 0; i<num; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            arr[x-1][y-1] = 1;
        }

        for(int i = 0; i<19; i++){
            for(int j = 0; j<19; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
