package question_3;
import java.util.Random;
import java.util.ArrayList;

public class LargestValue 
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int arr[] = new int[10];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = r.nextInt(10) + 1;
		
		int tempLarge = arr[0];
		ArrayList<Integer> pos = new ArrayList<Integer>();
		
		System.out.print("Array: ");
		for(int n : arr)
			System.out.print(n+" ");
		
		for(int i = 1; i < arr.length; i++)
		{
			if(tempLarge < arr[i])
				tempLarge = arr[i];
		}
		for(int i = 0; i < arr.length; i++)
			if(tempLarge == arr[i])
				pos.add(i);
		
		System.out.print("\nLargest value: "+tempLarge+" at position(s) ");
		for(int n : pos)
			System.out.print(n+" ");
		
		pos.clear();
		
	}
}
