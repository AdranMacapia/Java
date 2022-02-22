import java.io.*;
public class HighLow {
public static void main(String[] args)throws IOException{
BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));
String f;
int a,b,c;

System.out.print("Input first number: ");
f=Macapia.readLine();
a=Integer.parseInt(f);

System.out.print("Input Second number: ");
f=Macapia.readLine();
b=Integer.parseInt(f);

System.out.print("Input Third number: ");
f=Macapia.readLine();
c=Integer.parseInt(f);

System.out.println("\nThis are the Highest and Lowest number:");
if (a>b && a>c){
System.out.println("The Highest number: "+a);
}if (b>a && b>c){
System.out.println("The Highest number: "+b);
}if (c>a && c>b){
System.out.println("The Highest number: "+c);
}if (a<b && a<c){
System.out.println("The Lowest number: "+a);
}if (b<a && b<c){
System.out.println("The Lowest number: "+b);
}if (c<a && c<b){
System.out.println("The Lowest number: "+c);
}	
}
}