import java.io.*;
public class SuDiProQuo {
public static void main(String[] args)throws IOException{
BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));
String x;

float a,b,s,d,p,q;

	System.out.print("Input first number: ");
	x=Macapia.readLine();
	a= Float.parseFloat(x);

	System.out.print("Input second number: ");
	x=Macapia.readLine();
	b= Float.parseFloat(x);

	s= a + b;
	System.out.println("SUM: "+s);

	d= a - b;
	System.out.println("DIFF: "+d);

	p= a * b;
	System.out.println("PROD: "+p);

	q= a / b;
	System.out.println("QOU: "+q);
}
}