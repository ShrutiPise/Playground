import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      int i,fact=1;
      int n=7;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      for(i=1;i<=n;i++)
      {
        fact=fact*i;
      }
      System.out.println(fact);
	}
}