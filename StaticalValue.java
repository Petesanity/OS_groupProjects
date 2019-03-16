public class StaticalValue {

	 public static void main(String[] args) {
		
		 int arr [] = {90,81,78,95,79,72,85} ;
		 
		 Runnable run1 = new Average(arr); // create the task 
		 Thread thread1 = new Thread(run1);// create the thread
		 thread1.start(); // execute the program.
		 
		 
		 Runnable run2 = new Min(arr);
		 Thread thread2 = new Thread(run2);
		 thread2.start();
		 
		 
		 Runnable run3 = new Max(arr);
		 Thread thread3 = new Thread(run3);
		 thread3.start();
		 
		 
		

	}
	
}
	
	
		
		
		
	class Average implements Runnable {
		 int average = 0;
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
			
			System.out.print("The average is " + average + "\n");
		}
	}		
			
	class Min implements Runnable{
		private int arr[] ;

			
		public Min(int [] arr) {
			this.arr = arr;
		}
		
		@Override
		public void run() {
			int min = arr[0];
			for(int i = 1; i< arr.length; i++) {
				if(arr[i] < min)
					min = arr[i];
			}
			
			System.out.print("The min is " + min + "\n");
		}	
	}	
			
	class Max implements Runnable{
		private int arr [];

			
		public Max(int [] arr) {
			this.arr= arr;
		}
		
		@Override
		public void run() {
			int max = arr[0];
			for(int i = 1; i< arr.length; i++) {
				if(arr[i] > max)
					max = arr[i];
			}
			
		System.out.print("The max is " + max);
			
		}

	}
		
		



		

