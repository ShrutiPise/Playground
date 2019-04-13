import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
        String string = "madam";
      Scanner sc=new Scanner(System.in);
      string=sc.nextLine();
        boolean flag = true;    
            
        //Converts the given string into lowercase    
      //  string = string.toLowerCase();    
            
        //Iterate the string forward and backward, compare one character at a time     
        //till middle of the string is reached    
        for(int i = 0; i < string.length()/2; i++){    
            if(string.charAt(i) != string.charAt(string.length()-i-1)){    
                flag = false;    
                break;    
            }    
        }    
        if(flag)    
            System.out.println("Yes");    
        else    
            System.out.println("No");    
    } 
}