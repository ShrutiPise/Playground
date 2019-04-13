import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    
        String str = "abcab cdab";
    Scanner sc=new Scanner(System.in);
    str=sc.nextLine();
        
        String strFind = "ab";
        int count = 0, fromIndex = 0;
        
        while ((fromIndex = str.indexOf(strFind, fromIndex)) != -1 ){
 
         //   System.out.println("Found at index: " + fromIndex);
            count++;
            fromIndex++;
            
        }
        
        System.out.println(" " + count);
  } 
}