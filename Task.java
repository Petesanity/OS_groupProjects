public class Task {

	public static void main(String[] args) {
	Runnable pn = new PrimeNumbers(90); // create a new task
	Thread thread = new Thread(pn); // create a new thread
	thread.start(); // the starts the program so it can perform the given task.
	
			

	}

}
//The task class for printing numbers from 1 to n for a given n
class PrimeNumbers implements Runnable{
	int printUpTo;
	
	//Construct a task to initialize the instance variable in the constructor for printing 1, 2, ...to n term.
	public PrimeNumbers(int n) {
	printUpTo = n;
	}
	@Override 
	/*Override the run() method to tell the system
	   what task to execute. so it basically tell the thread how to run.
	*/
	public void run() { 
		int i=2;
		boolean isPrime;
		
		while(i < printUpTo) { // repeatedly looking for prime numbers
			// for this we going to assume the number is prime
			isPrime = true; // checking if current number is prime 
			
			//for loop is to loop through and detect the prime numbers.
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {  // if this statement is true then the number is not prime.
					isPrime = false; // following the "if statement", if the statment if true then we going to set isPrime to false. 
					break; // when we break then we exit the for loop.
				}
			}
			
			if(isPrime)
				System.out.print(i + "  ");	// displaying the prime numbers.
		i++; // increasing i by 1
		}
	
		
	}
	
}