import java.util.Scanner;
class Main{
	public static void main (String[] args){
	     // Type your code here
      int n=8, sum=0;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(int i=1;i<=n;++i)
      {
        sum+=i;
     
     	
        
      }
         System.out.println(""+sum);
	}
}