import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception, IOException {
		
		BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
		int a,x;  //Initialising variables
		System.out.println("Enter the number to be Iterated (A):"); //Message for user to input 
		a = Integer.parseInt(buff.readLine());  //Reading the input from user
		System.out.println("Enter the maximum limit (X):");  //Message for user to input 
		x = Integer.parseInt(buff.readLine());   //Reading the input from user
		for (int i = 0; i<3; i++){  //Iteration for increasing A by 1 and changing maximum to 2X and 3X
			display(a+i, x*(i+1)); // Calling display function from Display class by passing updated a and x
		}
		System.out.println("End of programme!");

	}
	public static void display(int a, int x){ //created display function 
		int i =1, m;  //Initialising variables
		System.out.println("A = "+a);  //Display A to user
		System.out.println("X = "+x);  //Display X to user
		m=1*a;
		while(m<=x){  //used while loop to iterate A until it reaches X
			System.out.println(i+" x "+a+" = "+m); //Display the multiples
			m = ++i*a; //change i and m 
		}
		System.out.println("Maximum iteration reached for "+a); //message to user to say maximum limit reached
	}

}
