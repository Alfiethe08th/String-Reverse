import java.util.Scanner;
public class ReverseMaker 
{
	public String twit;
		
		public String reverse (String post)
		{
			 String newtweet = "";
			 this.twit = post;
			   
			    for(int i = (post.length()-1); i>=0; i--)
			    {
			    	newtweet = newtweet + post.substring(i, (i+1));
			    }
			
			return newtweet;
		}
	}
