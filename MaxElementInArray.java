package practicetest;

public class MaxElementInArray {
	public static void main(String[] args) {
		int[] arr= {10,25,50,70,95};
	      int max=arr[0];                // Assume first element is max
	      for(int i=1;i<arr.length;i++)
	      {
	    	  if(arr[i]>max) {
	    		  max=arr[i];                 //update max if largest element is found
	    	  }
	      }
	      System.out.println("largest element in given array is: " + max);
	}
}
