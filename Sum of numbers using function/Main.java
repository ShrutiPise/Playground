import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      int num=7,sum=0;
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      System.out.println(sum(num));
	}
  public static int sum(int num)
  {
    int sum=0;
   	 for(int i = 1; i <= num; ++i)
        {
            // sum = sum + i;
          sum += i;
       
        }
    return sum;
  }
  
}
