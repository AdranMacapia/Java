import java.io.*;
public class Example2 {
	public static void main(String[] args)throws IOException{
	BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));
	String f;

	int x;

	System.out.print("Input a number: ");
	f=Macapia.readLine();
	x= Integer.parseInt(f);

	if(x>=10){
	x= x+5;
	System.out.println("The number you input is greater than 10 so it will be "+x);
	}else{
	System.out.println("The number "+x+" that you input is not greater than 10!");
}    
}
}