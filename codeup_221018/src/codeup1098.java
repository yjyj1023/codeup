import java.util.Scanner;

public class codeup1098 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] arr = new int[100][100];
        for(int i = 0; i<100; i++){
            for(int j = 0; j<100; j++){
                arr[i][j] = 0;
            }
        }

        int num = sc.nextInt();
        for(int i = 0; i<num; i++){
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt()-1;
            int y = sc.nextInt()-1;

            if(d == 0){

                for(int j = y; j<y+l; j++){
                    arr[x][j] = 1;
                }
            }else{
                if(x>l){
                    arr[x][y] = 1;
                }else{
                    for(int j = x; j<x+l; j++){
                        arr[j][y] = 1;
                    }
                }
            }
        }

        for(int i = 0; i<h; i++){
            for(int j = 0; j<w; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
