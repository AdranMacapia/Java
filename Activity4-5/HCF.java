import java.io.*;
public class HCF {
public static void main(String[] args)throws IOException{
BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));

int a = 40, b = 16;

	System.out.println("\nThe HCF of "+a+" and "+b+" is: "+ hcf(a,b));

}        
	static int hcf(int a, int b){
	if(a==0 && b==0)
		return 0;
	if(a == b)
		return a;       
        if(a > b)
             	return hcf(a-b,b);         
        else  
              	return hcf(a,b-a);        
        }
}