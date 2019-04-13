import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
      int num=8;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      System.out.println(square(num));
      
	} 
  public static int square(int num)
  {
   	return num*num; 
    
  }
}