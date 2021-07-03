package problemSet_1;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int [] arr = {2,6,9,10,23,35,46,56,60,71};

		System.out.println(recursiveSearch(arr, 11, 0, arr.length-1));

/*		int result = searchRecursive(arr, 761, 0, arr.length -1);
		if(result == -1)
			System.out.println("Element is not available in Array");
		else
			System.out.println(" Mentioned element available at intex " + result);*/
	}


	private static boolean recursiveSearch(int[] arr, int elementToSearch, int startIndex, int endIndex) {
		if (startIndex > endIndex)
			return false;
		int mid = (endIndex - startIndex)/2 + startIndex;
		if (arr[mid] == elementToSearch)
			return true;
		if (arr[mid] > elementToSearch)
			return recursiveSearch(arr, elementToSearch, startIndex, mid-1);
		return recursiveSearch(arr, elementToSearch, mid+1, endIndex);
	}
	
	private static int search(int[] arr, int elementToSearch){
		int startIndex = 0;
		int endIndex = arr.length - 1;
		while(startIndex <= endIndex){
			int midIndex = (startIndex + endIndex)/2;
			if(arr[midIndex] == elementToSearch)
				return midIndex;
			else if(arr[midIndex] > elementToSearch)
				endIndex = midIndex - 1;
			else
				startIndex = midIndex + 1;
		}
		return -1;
	}
	
	private static int search2(int[] arr, int elementToSearch){
		int startIndex = 0;
		int endIndex = arr.length - 1;
		while(true){
			if(startIndex > endIndex) return -1;
			int midIndex = (startIndex + endIndex)/2;
			if(arr[midIndex] == elementToSearch)
				return midIndex;
			else if(arr[midIndex] > elementToSearch)
				endIndex = midIndex - 1;
			else
				startIndex = midIndex + 1;
		}
	}
	
	private static int searchRecursive(int[] arr, int elementToSearch, int startIndex, int endIndex){
		int result = -1;
		if(startIndex > endIndex ) return result;
		int midIndex = (startIndex + endIndex)/2;
		
		if( arr[midIndex] ==  elementToSearch )
			result =  midIndex;
		else if ( arr[midIndex] > elementToSearch )
			result =  searchRecursive(arr, elementToSearch, startIndex, midIndex -1);
		else if(arr[midIndex] < elementToSearch)
			result =  searchRecursive(arr, elementToSearch, midIndex + 1, endIndex);
		
		return result;
		
	}

}
