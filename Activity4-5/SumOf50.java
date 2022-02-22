import java.io.*;
public class SumOf50 {
public static void main(String[] args)throws IOException{
BufferedReader Macapia= new BufferedReader(new InputStreamReader(System.in));
String x;
int N=0, sum=0;

	while(N<=50)
	{
		sum = N + sum;
		N= N+1;
	}
		System.out.print("\nThe Sum of the first "+N+" Numbers: "+sum);
		System.out.print("\n");
}
}