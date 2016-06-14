package AddDigits;

import java.util.Scanner;

public class AddDigits {

		public int digitSum(int myVariable){
			
				  
				    int checker = 1;
				    int result = 0;
				    int updater = 0;

				    //This while finds the size of the myVariable
				    while (myVariable % checker != myVariable) {
				    	int check = myVariable % checker;
				        checker = checker * 10;
				    }

				    //This for statement calculates, what you want.
				    for (int i = checker / 10; i > 0; i = i / 10) {

				        updater = myVariable / i;
				        result += updater;
				        myVariable = myVariable - (updater * i);
				    }
					return result;
				   
				}
}
	