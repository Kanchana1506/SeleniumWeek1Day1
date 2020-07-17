package week1.day2.classroom.arrays;

public class PrintDuplicate {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		//	get the length of the array
		int len = arr.length;
		System.out.println("array length  is " + len);
		
		//	declare an int variable named count
		int count;
		
		System.out.println("duplicates are: ");	
		
		//	iterate from 0 to the array length-1 (outer loop starts here)
		for (int i =0; i < arr.length-1 ; i++)
		{
		
			//	assign 0 to count 
		count= 0;
		
			//	iterate from i to the length of the array by adding 1 to it (inner loop starts here)
		for (int j = i+1 ; j < arr.length; j++)
		{
							//	compare both the loop variables & check they're equal
		if (arr[i] == arr [j])		
							//	increase the count if both the arrays are equal
			count ++; 
		}
		
			//	Out of the inner loop, check and print the first array variable if count is more than 0
		
		if (count > 0)
			System.out.println(arr[i]);
		}
	}
}