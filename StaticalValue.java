import java.util.Scanner;

public class StaticalValue {

	 public static void main(String[] args) {
		int[] arr = new int[args.length];
		for(int i=0; i< args.length; i++)
			arr[i] = Integer.parseInt(args[i]);

		Runnable run1  = new Average(arr); // create the task 
		Thread thread1 = new Thread(run1);// create the thread
		thread1.start();				  // execute the program.
		 
		Runnable run2  = new Min(arr);
		Thread thread2 = new Thread(run2);
		thread2.start();
		 
		Runnable run3  = new Max(arr);
		Thread thread3 = new Thread(run3);
		thread3.start();
	}
	
}
	
class Average implements Runnable {
	double average = 0;
	private int arr[];
		 
	public Average(int [] arr) {
		this.arr = arr;
	}
		 
	@Override
	public void run() {
		int sum = 0;
		for(int i = 0; i< arr.length; i++ ) {
			sum += arr[i];
			average = sum / arr.length;
		}
			
		System.out.println("The average is: " + average);
		
	}
}		
			
class Min implements Runnable{
	private int arr[] ;
	int min;
	public Min(int [] arr) {
		this.arr = arr;
	}
		
	@Override
	public void run() {
		 min = arr[0];
		for(int i = 1; i< arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
		}
			
		System.out.print("The min is: " + min  );
	}	
}	
			
class Max implements Runnable{
	private int arr [];
	int max;
	public Max(int [] arr) {
		this.arr= arr;
	}
		
	@Override
	public void run() {
		max = arr[0];
		for(int i = 1; i< arr.length; i++) {
			if(arr[i] > max)
				max = arr[i];
		}
			
		System.out.println("The max is: " + max );
	}
}
		
		



		

 