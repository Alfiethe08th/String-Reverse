import java.util.Scanner;
public class MainReverseMaker{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ReverseMaker rev = new ReverseMaker();
		 
	   while(true)
	   {
		   char deci = 'a';
		   System.out.println("Type your tweet");
		   String tweet = scan.nextLine();
		   System.out.println("Orginal tweet: " +tweet );
		   System.out.println("Reversed tweet: " + rev.reverse(tweet));
		   
		   System.out.println("Continue?");
		   String choice = scan.nextLine();
		   if(choice.charAt(0)=='Y'||choice.charAt(0)=='y')
		   {
			   System.out.println("Type your tweet");
			   tweet = scan.nextLine();
			   System.out.println("Orginal tweet: " +tweet );
			   System.out.println("Reversed tweet: " + rev.reverse(tweet));
		   }
		   else
		   {
			   System.out.println("Terminated");
			   break;
		   }
	   }
	  
	}

}