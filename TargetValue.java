 

import java.util.*;

public class TargetValue 
{
	public String CheckTarget(int K)
	{
		int[] numberCheck = new int[] {10,4,2,5,7};
		HashSet<Integer> hS = new HashSet<Integer>();
		
		for(int i = 0; i < numberCheck.length; i++) 
		{
    //if the hashset already has a value than the sum is found otherwise add that value in a
    //hashset
			if(hS.contains(numberCheck[i])) 
			{
				return "Found";	
			}
			hS.add(K - numberCheck[i]);
		}
		return "Not Found";
	}
	
	public static void main(String[] args) 
	{
		TargetValue t = new TargetValue();
		System.out.print(t.CheckTarget(6));
	}
		
}


