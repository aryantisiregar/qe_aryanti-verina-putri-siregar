import java.util.Scanner;
 
class Palindrome
{
   public static void main(String args[])
   {
      String str, rev = "";
      Scanner sc = new Scanner(System.in);
 
      System.out.println("Input:");
      str = sc.nextLine();
 
      int length = str.length();
 
      for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println("Output : true");
      else
         System.out.println("Output : false");
 
   }
}