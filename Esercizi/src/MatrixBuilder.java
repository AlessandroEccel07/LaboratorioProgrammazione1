import java.util.Random;
import java.util.Scanner;

public class MatrixBuilder {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[0]);
        int[][] matrix = new int[n][n];
        Random random = new Random();
        for (int riga = 0; riga < matrix.length; riga++) {
            for (int colonna = 0; colonna < matrix[riga].length; colonna++) {
                int CasualNumber = random.nextInt(m+1);
                System.out.print(CasualNumber + " ");
            }
            System.out.println();
        }
    }
}