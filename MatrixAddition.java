package java_Lab;

import java.util.Scanner;

public class MatrixAddition {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the order of square Matrix (n) : ");
		
		int n = sc.nextInt();
		
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		int c[][] = new int[n][n];
		
		System.out.println("Enter the elements of the matrix A : ");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		
System.out.println("Enter the elements of the matrix B : ");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
System.out.println("Sum of two Matrices  : ");
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(c[i][j] + "\t");
			}
			System.out.println();
		}
		sc.close();
		
	}
}
