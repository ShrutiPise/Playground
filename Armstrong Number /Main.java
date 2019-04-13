import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      int c=0,a=1,temp;
      int n=153;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      temp=n;
      while(n>0)
      {
        a=n%10;
        n=n/10;
        c=c+(a*a*a);
      }
      if(temp==c)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
	}
}