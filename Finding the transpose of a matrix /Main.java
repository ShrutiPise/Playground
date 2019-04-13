import java.util.Scanner;
class Main{
   
  public static void main(String args[]){
    // Type your code here
  int row,col; 
        Scanner sc=new Scanner(System.in);
    row=sc.nextInt();
    col=sc.nextInt();
     int a[][]=new int[row][col];
    for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
               // System.out.print("Element [" + (i+1) + "," + (j+1) + "] ? ");
                a[i][j]=sc.nextInt();
            }
        }
    for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        }
    
         
         
  }
}