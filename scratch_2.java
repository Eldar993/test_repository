import java.util.Arrays;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt();
       String[][] arr = new String[n][n];
        for (int i = 0;i < n -1;i++){
            for(int j = 0;j < n;j++){
                arr[n/2][j] = "*";
                arr[i][n/2] = "*";
                arr[i][i]=    "*";
                //arr[i][j] = "*";
                arr[i][j] = ".";
            }
        }
        for (int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
               System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

