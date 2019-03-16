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
#include <string.h>
#include <sys/wait.h>
#include <stdlib.h>
#include <cstdlib>

int main(int argc, char *argv[]){
	int arr = atoi(argv[1]); //convert char array and store it in int variable
	
	if(argc >=2){ // check if command line arguments are at least 2, one for ./Collatz and one for user input
		
		int returnValue = fork();  //make 2 processes which run the same program after this instruction

		if(returnValue == 0){ //only child process executes whats inside this statement

			while(arr!=1 && arr>0){ //if input is not 1
				printf("Child executing\n"); //printing initial number
				printf("%d\n", arr);

				if(arr%2 == 0){ //case for even

					arr= arr/2;

				}

				else if(arr%2==1){//case for odd		

					arr = (3 *arr) + 1;

				}

				if(arr == 1){ //printing one at the end of calculations
					printf("%d",arr);
					printf("\n");
				}
			}
			if(arr <=0){ //error checking to make sure user inputs a postive input value
				printf("PLEASE ENTER POSITIVE INPUT VALUE IN COMMAND LINE \n" );

			}
		}		
	}
	printf("Parent waiting\n");
	wait(NULL); //parent involking wait call
	printf("Parent exiting\n");
	return 0;		
}
