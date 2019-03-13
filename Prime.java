/*
	NAMES: Peter Farquharson
		   Davian Farquharson
		   Jose Cantres
		   Mahboba Mim
*/


import java.util.Scanner;
public class Prime implements Runnable{
	
	public void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = s.nextInt();
 		

 		//try/catch block
		try{
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
			if(num %i==0) return false; //  in this case, since there are no remainders this means it would be false
		}
		return true;
	}


	public static void main(String [] args){
		

		Thread object = new Thread(new Prime()); // a new Thread object is created with functionality from run class
		object.start(); //code inside the run method gets executed


	}
}
