package question_1;
import java.util.Random;

public class CopyArr 
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int orArray[] = new int[10];
		int cpyArray[] = new int[10];
		
		for(int i = 0; i < orArray.length; i++)
			orArray[i] = rand.nextInt(30) + 1;
		
		System.out.print("Original Array: ");
		for(int n : orArray)
			System.out.print(n+" ");
		
		System.out.print("\nEmpty Array: ");
		for(int n : cpyArray)
			System.out.print(n+" ");
		
		for(int i = 0; i < orArray.length; i++)
			cpyArray[i] = orArray[i];
		
		System.out.print("\nNew Copy Array: ");
		for(int n : cpyArray)
			System.out.print(n+" ");
	}
}
