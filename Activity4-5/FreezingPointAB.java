import java.io.*;
public class FreezingPointAB {
	public static void main(String[] args)throws IOException{
	BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));
	String x;
	Double Temp;

	System.out.print("Input a Temperature: ");
	x=Macapia.readLine();
	Temp= Double.parseDouble(x);

	if(Temp >= 32){
		System.out.println("Above Freezing Point");
	} else if (Temp < 32){
		System.out.println("Below Freezing Point");
    	}
}
}