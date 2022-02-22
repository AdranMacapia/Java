import java.io.*;
public class PNNN {
	public static void main(String[] args)throws IOException{
	BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));
	String x;
	int num;

	System.out.print("Input a number: ");
	x=Macapia.readLine();
	num= Integer.parseInt(x);

	if(num > 0){
		System.out.println("The Result: Positive number");
	} else if (num < 0){
		System.out.println("The Result: Negative number");
    	}
	else
		System.out.println("The Result: 0");
}
}