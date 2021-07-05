import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
 
         int size = scanner.nextInt();
         char[][] matrix = new char[size][size];
        for (int i = 0; i < matrix.length; i++) {
            Arrays.fill(matrix[i], '.');
        }
 
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = '*';
            matrix[i][matrix.length - 1 - i] = '*';
            matrix[i][matrix.length / 2] = '*';
            matrix[matrix.length / 2][i] = '*';
        }
 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
 System.out.println("Hello");
	    System.out.println();
        }
    }
}
