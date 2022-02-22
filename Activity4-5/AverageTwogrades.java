import java.io.*;
public class AverageTwogrades {
	public static void main(String[] args)throws IOException{
	BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));
	String x;
	float ave1,ave2,a,b,c,d;

	System.out.print("Input First Grade in Math: ");
	x=Macapia.readLine();
	a= Float.parseFloat(x);

	System.out.print("Input Second Grade in Math: ");
	x=Macapia.readLine();
	b= Float.parseFloat(x);

	ave1=(a+b)/2;
		System.out.println("");
		System.out.println("The Average grades of Math is: "+ave1);
		System.out.println("");
		System.out.println("");

	System.out.print("Input First Grade in Science: ");
	x=Macapia.readLine();
	c= Float.parseFloat(x);

	System.out.print("Input Second Grade in Science: ");
	x=Macapia.readLine();
	d= Float.parseFloat(x);

	ave2=(c+d)/2;
		System.out.println("");
		System.out.println("The Average grades of Science is: "+ave2);

}
}