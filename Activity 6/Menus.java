import java.io.*;
public class Menus {

	public static void main(String[] args) throws IOException {
		BufferedReader Macapia = new BufferedReader(new InputStreamReader(System.in));

		String str, str2, x;
		char op, response='y';

		while(response!='N' || response!='n')
		{
			System.out.println("\n\t\t\t\tM  E  N  U  S");
			System.out.println("\t\t\t----------------------------");
			System.out.println("\t\t\t\t[A] Apple");
			System.out.println("\t\t\t\t[B] Banana");
			System.out.println("\t\t\t\t[C] Caimito");
			System.out.println("\t\t\t\t[D] Duhat");
			System.out.println("\t\t\t\t[E] Eggplant");

			System.out.print("\n\t\t    Select an option [A, B, C, D, E]: ");
			str = Macapia.readLine();
			
			op = str.charAt(0);

			switch(op) 
			{

				case 'A':
				case 'a':
					System.out.println("\n\t\t    Apple is Red");
					break;

				case 'B':
				case 'b':
					System.out.println("\n\t\t    Banana is Yellow");
					break;

				case 'C':
				case 'c':
					System.out.println("\n\t\t    Caimito is Purple to Red or Yellow to Green");
					break;

				case 'D':
				case 'd':
					System.out.println("\n\t\t    Duhat is Dark purple to Black");
					break;

				case 'E':
				case 'e':
					System.out.println("\n\t\t    Eggplant is Dark Purple");
					break;
				default:
					System.out.println("\n\t\t    Invalid option");
					System.out.println("\t\t    Valid options are A, B, C, or D only");
			}
			System.out.print("\nDo you want to select again?[Y/N]:");
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