import java.io.*;
public class Interest {
public static void main(String[] args)throws IOException{
BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));

		String x;
		double amount, rate, interest;
		int years;
		
		System.out.print("Enter Ammount: ");
		x = Macapia.readLine();
		amount = Double.parseDouble(x);
		
		System.out.print("Enter rate: ");
		x = Macapia.readLine();
		rate = Double.parseDouble(x);
		
		System.out.print("Enter years: ");
		x = Macapia.readLine();
		years = Integer.parseInt(x);
		

		int year = 1;
	 	while(year<=years)
		{
			interest = (amount*year*rate)/100;
			System.out.println("After "+year+" years interest will be "+interest);
			year = year + 1;
		}
		
	}
}