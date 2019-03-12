/*
Group Names:

	Peter Farquharson
	Davian Farquharson
	Mahboba Mim	
	Jose Cantres
*/

#include <sys/types.h>
#include <stdio.h>
#include <unistd.h>
#include <sys/wait.h>

int main(){

	printf("Enter a number N :"); //prompt user for number
	int n;
	scanf("%d", &n); //user input for number n

	while(n<=0){ //error checking so a positive integer is passed
		printf("Please enter a positive number");
		scanf("%d", &n); //user input for number n
	}
	int returnValue = fork();  //make 2 processes which run the same program after this instruction
	
	if(returnValue == 0){ //only child process executes whats inside this statement

		while(n!=1){
			printf("Child executing\n");
			printf("%d\n",  n);
			if(n%2 == 0){ //case for even

				n = n/2;

			}

			else if(n%2==1){//case for odd		

				n = (3 *n) + 1;

			}

			if(n == 1){
				printf("Child executing\n");
				printf("%d  ",n);
				printf("\n");
				printf("Child exiting\n");
			}
		}
	}
	printf("Parent waiting\n");
	wait(NULL);
	printf("Parent exiting\n");

	return 0;		
}
