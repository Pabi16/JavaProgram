import java.util.*;
public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 3;
        int col=3;
        int[][] matrix = new int[row][col];
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        } 
        int[][] transpose = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }
        System.out.println("The transpose of the matrix is:");
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}

