/*
	NAMES: Peter Farquharson
		   Davian Farquharson
		   Jose Cantres
		   Mahboba Mim
*/



public class Ques2_Prime {

	public static void main(String [] args){

		int x = Integer.parseInt(args[0]); //command line input from user parsed as Integer
		Runnable run1 = new calc_Prime(x); //creating the task
		Thread thread = new Thread(run1); //creating the thread
		thread.start();
	}
}
class calc_Prime implements Runnable{ //class that calculates the prime
	private int num; //instance variable

	calc_Prime(int num){ //overloaded constructor to initialize the instance variable
		this.num =num;
	}

	
	public void run(){
		try{ 		//try/catch block

			for(int i =2; i<=num;i++){ //printing prime numbers from range 1 to num
				if(isPrime(i)) System.out.println(i); //if it is a prime number print it
			}
		}
		catch(Exception e){ //catching exception if it occurs
			System.out.println("Exception is caught");
		}

	}
	public static boolean isPrime(int num){ //determining if a number is prime
		for(int i = 2; i<num;i++){
			if(num %i==0) return false; //  in this case, since there are no remainders this means it would not be  a prime
		}
		return true; //it is prime
	}		
}
