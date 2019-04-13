import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int n=9;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(int i=1; i<=n;i++)
      {
        if(n%i==0)
        {
          System.out.println(i+" ");
        }
      }
	}
}