import java.io.*;
public class SwitchStatement {

	public static void main(String[] args) throws IOException {
		BufferedReader Macapia = new BufferedReader(new InputStreamReader(System.in));

		String str, x;
		int choice;
		char ans='y';

		do {
			System.out.println("Select Your Favorite Foods");
			System.out.println("1. Adobo");
			System.out.println("2. Menudo");
			System.out.println("3. Kare-kare");
			System.out.println("4. Mechado");

			System.out.print("Select your Choice: ");
			x = Macapia.readLine();
			choice = Integer.parseInt(x);

			switch(choice) {

				case 1:
					System.out.println("Adobo = P 50.00");
					break;
				case 2:
					System.out.println("Menudo = P 80.00");
					break;
				case 3:
					System.out.println("Kare-Kare = P 150.00");
					break;
				case 4:
					System.out.println("Mechado = P 250.00");
					break;
				default:
					System.out.println("Invalid Choice!");
					break;
			}
			System.out.print("\nDo you want to select again?[Y/N]: ");
			str = Macapia.readLine();

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