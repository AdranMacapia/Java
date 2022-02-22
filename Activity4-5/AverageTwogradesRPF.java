import java.io.*;
public class AverageTwogradesRPF {
	public static void main(String[] args)throws IOException{
	BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));
	String x;
	float ave1,ave2,a,b,c,d;

	System.out.print("Input First Grade of Math: ");
	x=Macapia.readLine();
	a= Float.parseFloat(x);

	System.out.print("Input Second Grade of Math: ");
	x=Macapia.readLine();
	b= Float.parseFloat(x);

	ave=(a+b)/2;
		System.out.println("");
		System.out.println("The Average Grades of Math is: "+ave1);
	
	if (ave1 >=75){
		System.out.println("Remarks: Passed");
	}
	else if (ave1 <=74.5){
		System.out.println("Remarks: Failed");
	}
		System.out.println("");
		System.out.println("");

	System.out.print("Input First Grade of Science: ");
	x=Macapia.readLine();
	c= Float.parseFloat(x);

	System.out.print("Input Second Grade of Science: ");
	x=Macapia.readLine();
	d= Float.parseFloat(x);

	ave2=(c+b)/2;
		System.out.println("");
		System.out.println("The Average Grades of Science is: "+ave2);
	
	if (ave1 >=75){
		System.out.println("Remarks: Passed");
	}
	else if (ave1 <=74.5){
		System.out.println("Remarks: Failed");
	}
}
}