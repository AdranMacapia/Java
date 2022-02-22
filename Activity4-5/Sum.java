import java.io.*;
public class Sum {
public static void main(String[] args)throws IOException{
BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));
String b;

int num1,num2,sum;

	System.out.print("Input first number: ");
	b=Macapia.readLine();
	num1= Integer.parseInt(b);

	System.out.print("Input Second number: ");
	b=Macapia.readLine();
	num2= Integer.parseInt(b);

	sum= num1 + num2;
	System.out.println("\nThe Sum of the two numbers: "+sum);
}
}