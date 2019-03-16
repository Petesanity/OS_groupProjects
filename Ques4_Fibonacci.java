/*
	NAME: Peter Farquharson
		  Mahboba Mim
		  Davian Farquharson
		  Jose Cantres
*/



public class Ques4_Fibonacci {

	public static void main(String [] args){
		
		int num = Integer.parseInt(args[0]); //command line input casted as integer
		int [] arr = new int [num]; //integer array of size num;

		Runnable run = new fibonacci(num,arr); //creating the task to compute fib numbers
		Thread t1 = new Thread(run); //creating thread
		t1.run(); //executes thread t1

		Thread t2 = new Thread(); //creating parent thread
		try{
			for(int i: arr){ //printing out fibonacci numbers
				System.out.println(i);
			}
			t2.join(); //waiting for thread t1 to finish
		}
		catch(Exception e){
			System.out.println("Exception is caught");
		}
		t2.run(); //running parent thread
	}
}

class fibonacci implements Runnable{ 
		int n; //instance variable
		int [] arr; //instance variable arr

		fibonacci(int n, int [] arr){//initializing instance variable
			this.n = n;
			this.arr = arr;
		}
		public void run(){
			try{
				arr[0] = 0;
				arr[1] = 1;
				if(n<1); // if number is less than 1, do nothing

				for(int i =2; i<n;i++){ //calculating the remaining fibonacci numbers
					arr[i] = arr[i-1] + arr[i-2];
				}
			}
			catch(Exception e){
				System.out.println("Exception is caught");
			}
		}
}


