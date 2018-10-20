package question_5;
import java.util.Scanner;

public class Words 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String user;
		
		System.out.print("Enter a string and separate with commas: ");
		user = sc.nextLine();
		String strArray[] = user.split(",");
		
		System.out.print("Output: ");
		for(String a : strArray)
			System.out.print(a+" ");
		sc.close();
	}
}
