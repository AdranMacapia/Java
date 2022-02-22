import java.io.*;
public class GradingSystem1{
	public static void main(String[]args)throws IOException {
	BufferedReader Macapia = new BufferedReader(new InputStreamReader(System.in));

	String str, f;
	char Lastname, firstname, section;
	float Attendance, Quiz, Rec, Project, Prelim_Exam, Midterm_Exam, Final_Exam;
	double ClassStanding1, ClassStanding2, ClassStanding3, Prelim_Grade, Midterm_Grade, Final_Grade, Sem_Grade;
	char ans;


	do{
		System.out.println("\n\t\t\t\t**********Grading System**********");
		System.out.println("\t\t\t\t   ******Preliminary Grade******");
		System.out.println("");

		System.out.print("\t\t\t\tEnter Last Name          : ");
		f = Macapia.readLine();

		System.out.print("\t\t\t\tEnter First Name         : ");
		f = Macapia.readLine();


		System.out.print("\t\t\t\tEnter Section            : ");
		f = Macapia.readLine();


		System.out.print("\t\t\t\tEnter Attendance         : ");
		f = Macapia.readLine();
		Attendance = Float.parseFloat(f);


		System.out.print("\t\t\t\tEnter Quiz               : ");
		f = Macapia.readLine();
		Quiz = Float.parseFloat(f);


		System.out.print("\t\t\t\tEnter Recitation         : ");
		f = Macapia.readLine();
		Rec = Float.parseFloat(f);


		System.out.print("\t\t\t\tEnter Project            : ");
		f = Macapia.readLine();
		Project = Float.parseFloat(f);


		ClassStanding1 = (Attendance + Quiz + Rec + Project)/4;
		System.out.println("\t\t\t\tClassStanding            : "+ ClassStanding1);


		System.out.print("\t\t\t\tInput Prelim Exam (Score): ");
		f = Macapia.readLine();
		Prelim_Exam = Float.parseFloat(f);


		Prelim_Grade = (ClassStanding1 + Prelim_Exam)/2;
		System.out.println("\n\t\t\t\tPrelim Grade: "+ Prelim_Grade);

		if (Prelim_Grade <=100 && Prelim_Grade >=96)
		{
			System.out.println("\t\t\t\tPoint: 1.0");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Prelim_Grade <=95.9 && Prelim_Grade >=93)
		{
			System.out.println("\t\t\t\tPoint: 1.25");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Prelim_Grade <=92.9 && Prelim_Grade >=91)
		{
			System.out.println("\t\t\t\tPoint: 1.5");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Prelim_Grade <=90.9 && Prelim_Grade >=88)
		{
			System.out.println("\t\t\t\tPoint: 1.75");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Prelim_Grade <=87.9 && Prelim_Grade >=86)
		{
			System.out.println("\t\t\t\tPoint: 2.00");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Prelim_Grade <=85.9 && Prelim_Grade >=84)
		{
			System.out.println("\t\t\t\tPoint: 2.25");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Prelim_Grade <=83.9 && Prelim_Grade >=80)
		{
			System.out.println("\t\t\t\tPoint: 2.5");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Prelim_Grade <=79.9 && Prelim_Grade >=78)
		{
			System.out.println("\t\t\t\tPoint: 2.75");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Prelim_Grade <=77.9 && Prelim_Grade >=74.6)
		{
			System.out.println("\t\t\t\tPoint: 3.00");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Prelim_Grade <=74.5 && Prelim_Grade >=70)
		{
			System.out.println("\t\t\t\tPoint: 5.00");
			System.out.println("\t\t\t\tYou Failed!");
		}

		System.out.println("");
		System.out.println("\t\t\t\t   *******Midterm Grade*******");
		System.out.println("");

		System.out.print("\t\t\t\tEnter Attendance         : ");
		f = Macapia.readLine();
		Attendance = Float.parseFloat(f);


		System.out.print("\t\t\t\tEnter Quiz               : ");
		f = Macapia.readLine();
		Quiz = Float.parseFloat(f);


		System.out.print("\t\t\t\tEnter Recitation         : ");
		f = Macapia.readLine();
		Rec = Float.parseFloat(f);


		System.out.print("\t\t\t\tEnter Project            : ");
		f = Macapia.readLine();
		Project = Float.parseFloat(f);


		ClassStanding2 = (Attendance + Quiz + Rec + Project)/4;
		System.out.println("\t\t\t\tClassStanding            : "+ ClassStanding2);


		System.out.print("\t\t\t\tInput Midterm Exam (Score): ");
		f = Macapia.readLine();
		Midterm_Exam = Float.parseFloat(f);


		Midterm_Grade = (ClassStanding2 + Midterm_Exam)/2;
		System.out.println("\n\t\t\t\tMidterm Grade: "+ Midterm_Grade);

		if (Midterm_Grade <=100 && Midterm_Grade >=96)
		{
			System.out.println("\t\t\t\tPoint: 1.0");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Midterm_Grade <=95.9 && Midterm_Grade >=93)
		{
			System.out.println("\t\t\t\tPoint: 1.25");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Midterm_Grade <=92.9 && Midterm_Grade >=91)
		{
			System.out.println("\t\t\t\tPoint: 1.5");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Midterm_Grade <=90.9 && Midterm_Grade >=88)
		{
			System.out.println("\t\t\t\tPoint: 1.75");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Midterm_Grade <=87.9 && Midterm_Grade >=86)
		{
			System.out.println("\t\t\t\tPoint: 2.00");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Midterm_Grade <=85.9 && Midterm_Grade >=84)
		{
			System.out.println("\t\t\t\tPoint: 2.25");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Midterm_Grade <=83.9 && Midterm_Grade >=80)
		{
			System.out.println("\t\t\t\tPoint: 2.5");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Midterm_Grade <=79.9 && Midterm_Grade >=78)
		{
			System.out.println("\t\t\t\tPoint: 2.75");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Midterm_Grade <=77.9 && Midterm_Grade >=74.6)
		{
			System.out.println("\t\t\t\tPoint: 3.00");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Midterm_Grade <=74.5 && Midterm_Grade >=70)
		{
			System.out.println("\t\t\t\tPoint: 5.00");
			System.out.println("\t\t\t\tYou Failed!");
		}


		System.out.println("");
		System.out.println("\t\t\t\t   *******Final Grade*******");
		System.out.println("");

		System.out.print("\t\t\t\tEnter Attendance         : ");
		f = Macapia.readLine();
		Attendance = Float.parseFloat(f);


		System.out.print("\t\t\t\tEnter Quiz               : ");
		f = Macapia.readLine();
		Quiz = Float.parseFloat(f);


		System.out.print("\t\t\t\tEnter Recitation         : ");
		f = Macapia.readLine();
		Rec = Float.parseFloat(f);


		System.out.print("\t\t\t\tEnter Project            : ");
		f = Macapia.readLine();
		Project = Float.parseFloat(f);


		ClassStanding3 = (Attendance + Quiz + Rec + Project)/4;
		System.out.println("\t\t\t\tClassStanding            : "+ ClassStanding3);


		System.out.print("\t\t\t\tInput Final Exam (Score): ");
		f = Macapia.readLine();
		Final_Exam = Float.parseFloat(f);


		Final_Grade = (ClassStanding3 + Final_Exam)/2;
		System.out.println("\n\t\t\t\tFinal Grade: "+ Final_Grade);

		if (Final_Grade <=100 && Final_Grade >=96)
		{
			System.out.println("\t\t\t\tPoint: 1.0");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Final_Grade <=95.9 && Final_Grade >=93)
		{
			System.out.println("\t\t\t\tPoint: 1.25");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Final_Grade <=92.9 && Final_Grade >=91)
		{
			System.out.println("\t\t\t\tPoint: 1.5");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Final_Grade <=90.9 && Final_Grade >=88)
		{
			System.out.println("\t\t\t\tPoint: 1.75");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Final_Grade <=87.9 && Final_Grade >=86)
		{
			System.out.println("\t\t\t\tPoint: 2.00");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Final_Grade <=85.9 && Final_Grade >=84)
		{
			System.out.println("\t\t\t\tPoint: 2.25");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Final_Grade <=83.9 && Final_Grade >=80)
		{
			System.out.println("\t\t\t\tPoint: 2.5");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Final_Grade <=79.9 && Final_Grade >=78)
		{
			System.out.println("\t\t\t\tPoint: 2.75");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Final_Grade <=77.9 && Final_Grade >=74.6)
		{
			System.out.println("\t\t\t\tPoint: 3.00");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Final_Grade <=74.5 && Final_Grade >=70)
		{
			System.out.println("\t\t\t\tPoint: 5.00");
			System.out.println("\t\t\t\tYou Failed!");
		}

		System.out.println("");
		System.out.println("\t\t\t\t   *******Semestral Grade*******");
		System.out.println("");

		Prelim_Grade = (ClassStanding1 + Prelim_Exam)/2;
		System.out.println("\t\t\t\tPrelim Grade: "+ Prelim_Grade);

		Midterm_Grade = (ClassStanding2 + Midterm_Exam)/2;
		System.out.println("\t\t\t\tMidterm Grade: "+ Midterm_Grade);

		Final_Grade = (ClassStanding3 + Final_Exam)/2;
		System.out.println("\t\t\t\tFinal Grade: "+ Final_Grade);

		Sem_Grade = (Prelim_Grade + Midterm_Grade + Final_Grade)/3;
		System.out.println("\n\t\t\t\tSemestral Grade: "+ Sem_Grade);

		if (Sem_Grade <=100 && Sem_Grade >=96)
		{
			System.out.println("\t\t\t\tPoint: 1.0");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Sem_Grade <=95.9 && Sem_Grade >=93)
		{
			System.out.println("\t\t\t\tPoint: 1.25");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Sem_Grade <=92.9 && Sem_Grade >=91)
		{
			System.out.println("\t\t\t\tPoint: 1.5");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Sem_Grade <=90.9 && Sem_Grade >=88)
		{
			System.out.println("\t\t\t\tPoint: 1.75");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Sem_Grade <=87.9 && Sem_Grade >=86)
		{
			System.out.println("\t\t\t\tPoint: 2.00");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Sem_Grade <=85.9 && Sem_Grade >=84)
		{
			System.out.println("\t\t\t\tPoint: 2.25");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Sem_Grade <=83.9 && Sem_Grade >=80)
		{
			System.out.println("\t\t\t\tPoint: 2.5");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Sem_Grade <=79.9 && Sem_Grade >=78)
		{
			System.out.println("\t\t\t\tPoint: 2.75");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Sem_Grade <=77.9 && Sem_Grade >=74.6)
		{
			System.out.println("\t\t\t\tPoint: 3.00");
			System.out.println("\t\t\t\tYou Passed!");
		}
		else if (Sem_Grade <=74.5 && Sem_Grade >=70)
		{
			System.out.println("\t\t\t\tPoint: 5.00");
			System.out.println("\t\t\t\tYou Failed!");
		}
		System.out.println("");
		System.out.print("\t\t\t\tDo you want to Compute Again[y/n]: ");


		ans = (char)Macapia.readLine().charAt(0);


		}while (ans == 'Y' || ans == 'y');
}
}