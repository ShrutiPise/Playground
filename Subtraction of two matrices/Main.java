import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    // Type your code here
    int r,c,i,j;
		//scanner class object 
		Scanner scan = new Scanner(System.in);
		
		//input total number of rows and cols (i.e. base for both)
		//System.out.print("Enter the base of the matrices : ");
		r = scan.nextInt();
		c = scan.nextInt();
		//matrix (two_d array) object declarations
		int mat1[][] = new int[r][c];
		int mat2[][] = new int[r][c];
		int mat3[][] = new int[r][c];
		
		//input matrix 1
		//System.out.println("Enter the elements of the first matrix : ");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				mat1[i][j] = scan.nextInt();
			}
		}
		
		//input matrix 2
		//System.out.println("Enter the elements of the second matrix : ");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				mat2[i][j] = scan.nextInt();
			}
		}

		//subtracting matrices 
		//System.out.println("Subtracting Matrices --Matrix1 - Matrix2--");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				mat3[i][j] = mat1[i][j] - mat2[i][j];
			}
		}

		//printing final matrix
		//System.out.println(" ");
		for(i=0; i<r; i++)
		{
			for(j=0; j<c; j++)
			{
				System.out.print(mat3[i][j]+ " ");
			}
			System.out.println();
		}
  }
}