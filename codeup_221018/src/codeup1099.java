import java.util.Scanner;

public class codeup1099 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[10][10];

        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int x = 1;
        int y = 1;
        while(true){
            if(arr[x][y]==2){
                arr[x][y] = 9;
                break;
            }
            arr[x][y] = 9;

            if(arr[x][y+1]!=1){
                if(arr[x][y+1]==2){
                    arr[x][y+1] = 9;
                    break;
                }else{
                    y+=1;
                }
            }else{
                if(arr[x+1][y]==2){
                    arr[x+1][y] = 9;
                    break;
                }else{
                    if(arr[x+1][y]==1){
                        break;
                    }else{
                        x+=1;
                    }

                }
            }
        }

        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
