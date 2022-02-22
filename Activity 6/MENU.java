import java.io.*;
public class MENU {

	public static void main(String[] args) throws IOException {
		BufferedReader c2021 = new BufferedReader(new InputStreamReader(System.in));

		String str, x;
		char choice, ans='y';

		do {
			System.out.println("*********MENUS*********");
			System.out.println("A. Apple");
			System.out.println("B. Banana");
			System.out.println("C. Duhat");
			System.out.println("E. Eggplant");

			System.out.print("Select your Choice: ");
			x = c2021.readLine();
			
			choice = x.charAt(0);

			switch(choice) {


				case 'A':
				case 'a':
					System.out.println("Apple is ");
					break;

				case 'B':
				case 'b':
					System.out.println("Banana is ");
					break;

				case 'C':
				case 'c':
					System.out.println("Caimito is ");
					break;

				case 'D':
				case 'd':
					System.out.println("Duhat is ");
					break;

				case 'E':
				case 'e':
					System.out.println("Eggplant is ");
					break;
				default:
					System.out.println("Invalid choice");

			}
			System.out.print("\nDo you want to select again?[Y/N]: ");
			str = c2021.readLine();

			ans = str.charAt(0);
			if(ans == 'Y' || ans == 'y')
			{
				continue;
			}
			else
			{
				break;
			}

		}while (ans != 'N' || ans != 'n');
		
	}
}