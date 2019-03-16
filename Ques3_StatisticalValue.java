
/*
		NAMES: Davian Farquharson
			   Jose Cantres
			   Mahboba Mim
			   Peter Farquharson
			
*/

public class Ques3_StatisticalValue {

	 public static void main(String[] args) {
		int[] arr = new int[args.length]; //creating an integer array with length of array from command line
		for(int i=0; i< args.length; i++)
			arr[i] = Integer.parseInt(args[i]); //storing values from args array to arr array

		Runnable run1  = new Average(arr); // create the task for calculating average
		Thread thread1 = new Thread(run1);// create the thread
		thread1.start();				  // execute the program.
		 
		Runnable run2  = new Min(arr);// create the task for calculating minimum values
		Thread thread2 = new Thread(run2);//create the thread
		thread2.start(); //execute the program
		 
		Runnable run3  = new Max(arr); // create the task for calculating maximum values
		Thread thread3 = new Thread(run3); //create the thread
		thread3.start(); //execute the program
	}
	
}
	
class Average implements Runnable {
	int average = 0; //declaring instance variable for average
	private int arr[]; // declaring instance variable for array
		 
	public Average(int [] arr) { //overloaded constructor for initializing the array
		this.arr = arr;
	}
		 
	@Override
	public void run() {
		int sum = 0;
		for(int i = 0; i< arr.length; i++ ) { //calculating the average
			sum += arr[i];
			average = sum / arr.length;
		}
			
		System.out.println("The average value is " + average);
		
	}
}		
			
class Min implements Runnable{
	private int arr[] ; //declaring instance variable for array
	int min; //declaring instance variable for minimum
	public Min(int [] arr) {//overloaded contructor for initializing array
		this.arr = arr;
	}
		
	@Override
	public void run() {
		 min = arr[0];
		for(int i = 1; i< arr.length; i++) { //calculating minimum
			if(arr[i] < min)
				min = arr[i];
		}
			
		System.out.println("The minimum value is " + min  );
	}	
}	
			
class Max implements Runnable{
	private int arr []; //declaring instance variable for average
	int max; //declaring instance variable for maximum
	public Max(int [] arr) { //overloading constructor for initializing array
		this.arr= arr;
	}
		
	@Override
	public void run() {
		max = arr[0];
		for(int i = 1; i< arr.length; i++) { //calculating maximum
			if(arr[i] > max)
				max = arr[i];
		}
			
		System.out.println("The maximum value is " + max );
	}
}
		
		



		

 