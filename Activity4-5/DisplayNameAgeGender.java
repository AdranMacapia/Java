import java.io.*;
public class DisplayNameAgeGender {
public static void main(String[] args)throws IOException{
BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));
String x;

int Age;

	System.out.print("Enter your Name: ");
	x=Macapia.readLine();

	System.out.print("Enter your Age: ");
	x=Macapia.readLine();
	Age= Integer.parseInt(x);

	System.out.print("Enter your Gender: ");
	x=Macapia.readLine();
}
}