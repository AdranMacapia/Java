import java.io.*;
public class EvenOdd {
	public static void main(String[] args)throws IOException{
	BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));
	String x;

	int number;

	System.out.print("Input a number: ");
	x=Macapia.readLine();
	number= Integer.parseInt(x);

	if(number%2==0)
		System.out.println("The Result: Even number");
	else
		System.out.println("The Result: Odd number");
    }
}