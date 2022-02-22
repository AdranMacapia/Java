import java.io.*;
public class Temp {
public static void main(String[] args)throws IOException{
BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));

     double ftemp,ctemp,f,c;
     String str, str2, x;
     char op, response='y';
   
   while(response!='N' || response!='n')
{
   System.out.println("Conversion");
   System.out.println("[A] : Fahrenheit to Celsius");
   System.out.println("[B] : Celsius to Fahrenheit");
   System.out.println(" ");
   System.out.print("Choose conversion:[A][B]: ");
   str = Macapia.readLine();
   
   op = str.charAt(0);
   
   if(op =='A' || op =='a')
   {
     System.out.println("");
     System.out.print("Enter temperature in fahrenheit: ");
     x = Macapia.readLine();
     ftemp = Double.parseDouble(x);
       
     c = ((ftemp - 32.0)*(5.0/9.0));
       
	System.out.println("");
	System.out.println("(Fahrenheit to Celsius)");
	System.out.println("The Formula: ("+ftemp+" F - 32.0) * (5.0/9.0) = "+c+" C");

       
    }
    else if(op =='B' || op=='b')
    {
      System.out.println("");
      System.out.print("Enter temperature in celsius: ");
      x = Macapia.readLine();
      ctemp = Double.parseDouble(x);
       
      f = ctemp * (9.0/5.0) + 32;
       
	System.out.println("");
	System.out.println("(Celsius to Fahrenheit)");
	System.out.println("The Formula: ("+ctemp+" C) * (9.0/5.0) + 32.0 = "+f+" F");
     }
	System.out.print("\n\tDo you want to continue (y/n)?");
	str2 = Macapia.readLine();

	response = str2.charAt(0);

	if(response=='Y' || response=='y')
	{
		continue;
	}
	else
	{
		break;
	}
}
}
}