import java.io.*;
public class AverageTwoGradesEA {
	public static void main(String[] args)throws IOException{
	BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));
	String x;
	float ave,num1, num2;

	System.out.print("Input First Grade: ");
	x=Macapia.readLine();
	num1= Float.parseFloat(x);

	System.out.print("Input Second Grade: ");
	x=Macapia.readLine();
	num2= Float.parseFloat(x);

	ave = (num1 + num2)/2;
	
	if (ave <=100 && ave >=98)
	{
		System.out.println("");
		System.out.println("passed");
		System.out.println("The Average: "+ave+" is Excellent");
	}
	else if (ave <=97 && ave >=94)
	{
		System.out.println("");
		System.out.println("passed");
		System.out.println("The Average: "+ave+" is Very Good");
	}
	else if (ave <=93 && ave >=90)
	{
		System.out.println("");
		System.out.println("passed");
		System.out.println("The Average: "+ave+" is Good");
	}
	else if (ave <=89 && ave >=85)
	{
		System.out.println("");
		System.out.println("passed");
		System.out.println("The Average: "+ave+" is Very Satisfactory");
	}
	else if (ave <=84 && ave >=80)
	{
		System.out.println("");
		System.out.println("passed");
		System.out.println("The Average: "+ave+" is Satisfactory");
	}
	else if (ave <=79 && ave >=75)
	{
		System.out.println("");
		System.out.println("passed");
		System.out.println("The Average: "+ave+" is Needs Improvement");
	}
	else if (ave <=74 && ave >=70)
	{
		System.out.println("");
		System.out.println("Failed");
		System.out.println("The Average: "+ave+" is Poor");
	}

}
}