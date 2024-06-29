/**
 * 
 */

/**
 * The purpose of this program is to compute different matrices and its matrix operations. The 
 * supported operations are subtraction and multiplication for n * n matrices.
 * 
 * @author abdonm
 *
 */
public class Homework3Computations {

	/**
	 * The programs main execution point
	 * @param args
	 */
	public static void main(String[] args) {
		hw3Problem12();
		hw3Problem13();
		hw3Problem15();
	}
	
	public static void hw3Problem12 () {
		System.out.println("Homework 3, Question 12:");
		int A[][] = {
				{1, 3},
				{5, 4}
		};
		
		int B[][] = {
				{-2, 2},
				{2, -4}
		};
		matrixCalctns(A, B);
		System.out.println();
	}
	
	public static void hw3Problem13() {
		System.out.println("Homework 3, Question 15:");
		int A[][] = {
				{3, -4, 2},
				{3, 4, -3},
		};
		
		int B[][] = {
				{2, -2},
				{-5, 3},
				{3, -4}
		};
		int result[][] = dotProductMatrices(A, B);
		printResult(result);
		System.out.println();
	}
	
	public static void hw3Problem15 () {
		System.out.println("Homework 3, Question 15:");
		int A[][] = {
				{-2, 1, 1},
				{1, 4, 1},
				{3, -2, -1}
		};
		
		int B[][] = {
				{2, 3, 2},
				{5, 2, -2},
				{3, -4, 2}
		};
		int result[][] = multiplyMatrices(A, B);
		printResult(result);
		System.out.println();
	}
	
	public static void matrixCalctns(int matrixA[][], int matrixB[][]) {
		
		int resultA[][] = multiplyMatrices(matrixA, matrixB);
		System.out.println("Result A: ");
		printResult(resultA);
		
		int resultB[][] = multiplyMatrices(matrixB, matrixA);
		System.out.println("Result B: ");
		printResult(resultB);
		
		int resultBsubA[][] = subtractMatrices(resultA, resultB);
		System.out.println("Result from AB - BA: ");
		printResult(resultBsubA);
	}
	
	public static void printResult(int C[][]) {
		for (int[] row : C) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * This method is for multiplying n * n matrices, it cannot handle m * n matrices and such.
	 * 
	 * @param A matrix (array) A
	 * @param B matrix (array) B
	 * @return Returns the resulting scalar multiplication of A * B = matrix (array) C
	 */
	public static int[][] multiplyMatrices(int A[][], int B[][]) {
		int n = A.length;
		int[][] C = new int[n][n];
		
		for  (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		return C;
	}
	
	public static int[][] dotProductMatrices(int a[][], int b[][]) {
		int rowsA = a.length;
		int colsA = a[0].length;
		
		int rowsB = b.length;
		int colsB = b[0].length;
		
		if (colsA != rowsB) {
			System.out.println("Matrices are incompatiable");
			return null;
		}
		
		int result[][] = new int[rowsA][colsB];
		
		for (int i = 0; i < rowsA; i++) {
			for(int j = 0; i < colsB; j++) {
				result[i][j] = 0;
				for (int k = 0; k < colsA; k++) {
					result[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		
		return result;
	}
	
	/**
	 * This method is for subtracting n * n matrices, it cannot handle m * n matrices and such.
	 * 
	 * @param A matrix (array) A
	 * @param B matrix (array) B
	 * @return Returns the result from the scalar multiplication of A * B = matrix (array) C
	 */
	public static int[][] subtractMatrices(int A[][], int B[][]) {
		int n = A.length;
		int[][] C = new int[n][n];
		
		for  (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				C[i][j] = A[i][j] - B[i][j];
			}
		}
		return C;
	}

}
