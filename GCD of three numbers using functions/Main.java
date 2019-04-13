import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int num1,num2;
      num1=sc.nextInt();
      num2=sc.nextInt();
      System.out.println(findGCD(num1,num2));
	}
   private static int findGCD(int num1, int num2) {
        if(num2 == 0){
            return num1;
        }
        return findGCD(num2, num1%num2);
    }
}