import java.util.Scanner;
class Main {
	public static void main (String[] args){
        // Type your code here
      int i,j,n=5;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      
      for(i=0; i < n ;i++)
      {
         for(j=0; j < n ;j++)
        {
            //5
            if(i==j || j==(n-i-1))
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
      }
        System.out.println(" ");
      }
    }
	
}