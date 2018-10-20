package question_4;
import java.util.Random;
import java.util.Scanner;

public class Frequency 
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int orgArr[] = new int[10];
		int user, counter = 0;
		
		for(int i = 0; i < orgArr.length; i++)
			orgArr[i] = rand.nextInt(15) + 1;
		
		System.out.print("Array: ");
		for(int n : orgArr)
			System.out.print(n+" ");
		
		System.out.print("\nEnter a value to search: ");
		user = sc.nextInt();
		
		for(int i = 0; i < orgArr.length; i++)
		{
			if(user == orgArr[i])
				counter++;
		}
		System.out.print(user+" was found "+counter+" time(s).");
		sc.close();
	}
}
