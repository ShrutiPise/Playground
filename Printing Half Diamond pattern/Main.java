import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      int n=5;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      int i,j;
      int count=n-1;
      for(i=1;i<=n;i++)
      {
       	for(j=1;j<=count;j++)
        {
          System.out.print(" ");
       
        }
           count--;
        for(int k=1;k<= 2 * i-1;k++)
        {
           System.out.print("*");
        }
        System.out.println();
      }
	}
}