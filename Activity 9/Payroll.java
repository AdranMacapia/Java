import java.io.IOException;
import java.util.*;
public class Group16_Payroll_C2021{
public static void main(String[]args) throws IOException{


String name1="Jose Rizal A", position1="Manager", department1="IT", status1="Single";
double deductions, totalIncome, Overtime, OverHrs, HrsPay= 350, Monthsal1= 99840, allo1= 4500, HouseLoan, CarLoan, TotalLoan, GrossPay;

double numworks=192, late, abse, absehrs=8, absetot, TotHrs, rate = 520, minuteded = 50, minute, minut = 0, hourded = 150, hour, totalhrs;
int undertime, undertot, underhrs = 4;

double tax, SSS, PhilH, PGBG, NetPay;

String name2="Andres Bonifacio C", position2="Assistant Manager", department2="IT", status2="Single";
double deductions1, totalIncome1, Overtime1, OverHrs1, MonthSal2 = 86400, allo2 = 2500;
        
double rate1=450;

String name3="Lexi Lore S", position3="Secretary", department3="IT", status3="Married";
double deductions2, totalIncome2, Overtime2, OverHrs2, MonthSal3 = 67200, allo3 = 1500;
        
double rate2=350;

String name4="Ivana Alawi S", position4="Assistant Secretary", department4="IT", status4="Widow";
double deductions3, totalIncome3, Overtime3, OverHrs3, MonthSal4 = 57600, allo4 = 1000;
        
double rate3=300;


int sel, EmpNum;
char ans;


do { 
Scanner in=new Scanner(System.in);

System.out.println("-------------------------------------------------------------------------------------------------------------");
System.out.println("                                         TAGUIG CITY Payroll System 101");
System.out.println("-------------------------------------------------------------------------------------------------------------");
System.out.println("-------------------------------------------------------------------------------------------------------------");
System.out.println("|Emplyee|    Employee Name     |    Position     | Department | rate   | Monthly | Allowances| Official     |");
System.out.println("|Number |                      |                 |            | /hour  | Salary  |           | time= 8hours |");
System.out.println("|       |                      |                 |            |        |         |           |Overtime      |");
System.out.println("|       |                      |                 |            |        |         |           |exceeding     | ");
System.out.println("|       |                      |                 |            |        |         |           |1 hour=P350   |");
System.out.println("-------------------------------------------------------------------------------------------------------------");
System.out.println("| 1001  | Jose Rizal A         | Manager         |     IT     |  520   | 99,840  |  4,500    |              |");
System.out.println("| 1002  | Andres Bonifacio C   | Asst. Manager   |     IT     |  450   | 88,400  |  2,500    |              |");
System.out.println("| 1003  | Lexi Lore S          | Secretary       |     IT     |  350   | 67,200  |  1,500    |              |");
System.out.println("| 1004  | Ivana Alawi S        | Asst. Secretary |     IT     |  300   | 57,600  |  1,000    |              |");
System.out.println("-------------------------------------------------------------------------------------------------------------");
System.out.println("Enter Employee's Data \n");


System.out.print("Employee Number   : ");
EmpNum=in.nextInt();

switch (EmpNum) {
case 1001:
    System.out.println("Name              : "+name1);
    System.out.println("Position          : "+position1);
    System.out.println("Department        : "+department1);
    System.out.println("Status            : "+status1);
    System.out.println("Monthly Salary    : P"+Monthsal1);
    System.out.println("Allowances        : P"+allo1);
    System.out.print("Overtime          : ");
OverHrs=in.nextDouble();
Overtime= OverHrs*HrsPay;
        System.out.println("OvertimePay       : P"+Overtime);
totalIncome = Monthsal1 + allo1 + Overtime;
        System.out.println("TOTAL INCOME      : P"+totalIncome);
        
System.out.println("------------------------------------------------------");
System.out.println("                 D E D U C T I O N S                   ");
System.out.println("------------------------------------------------------");
        System.out.println("Number of Hours Works   : "+numworks);
        System.out.print("Late(Hr)                : ");
    hour =in.nextDouble();
        
totalhrs = hour*hourded;
        System.out.print("Late(Min)               : ");
        minute = in.nextDouble();
if (minute>=1 && minute<=55){
    minute = minuteded;
}
else if (minute==0){
    minute = minut;
}
late=minute+totalhrs;

        System.out.print("Absences                : ");
        abse = in.nextDouble();
        absetot = absehrs*abse;
        
        System.out.print("Undertime               : ");
        undertime = in.nextInt();
        undertot = undertime*underhrs;
        
     TotHrs = numworks-undertot-absetot-hour;
     System.out.println("Total Hours             : "+TotHrs);
     System.out.println("Rate                    : P"+rate);
     totalIncome = TotHrs*rate+allo1+Overtime-late;
     System.out.println("Total Income            : P"+totalIncome);
     
System.out.print("\nSpecify Tax Bracket \n\n");
System.out.print("(1)Single (2)Married (3)Widow");

System.out.print("\n\nEnter your choice: ");

sel=in.nextInt();
if(sel==1)
{
tax= totalIncome*.20;
SSS= totalIncome*.07;
PGBG= totalIncome*.01;
PhilH= totalIncome*.01;
deductions= tax + SSS + PGBG + PhilH;

System.out.println("TAX             : "+tax);
System.out.println("SSS             : "+SSS);
System.out.println("PAGIBIG         : "+PGBG);
System.out.println("PhilHealth      : "+PhilH);
System.out.println("\n\n DEDUCTIONS     : "+deductions);
}

else if(sel==2)
{
tax= totalIncome*.10;
SSS= totalIncome*.03;
PGBG= totalIncome*.01;
PhilH= totalIncome*.01;
deductions= tax + SSS + PGBG + PhilH;

System.out.println("TAX             : "+tax);
System.out.println("SSS             : "+SSS);
System.out.println("PAGIBIG         : "+PGBG);
System.out.println("PhilHealth      : "+PhilH);
System.out.println("\n\n DEDUCTIONS     : "+deductions);
}
else
{
tax= totalIncome*.08;
SSS= totalIncome*.02;
PGBG= totalIncome*.01;
PhilH= totalIncome*.01;
deductions= tax + SSS + PGBG + PhilH;

System.out.println("TAX             : "+tax);
System.out.println("SSS             : "+SSS);
System.out.println("PAGIBIG         : "+PGBG);
System.out.println("PhilHealth      : "+PhilH);
System.out.println("\n\n DEDUCTIONS     : "+deductions);
}
     
System.out.println("\n-------------------------------------------");
System.out.println("                Payroll Slip");
System.out.println("-------------------------------------------\n");
System.out.print("\n    Name            : "+name1);
System.out.print("\n    Position        : "+position1);
System.out.print("\n    Department      : "+department1);
System.out.print("\n    Status          : "+status1);
System.out.print("\n    Monthly Salary  : "+Monthsal1);
System.out.print("\n    Allowances      : "+allo1);
System.out.print("\n    Overtime        : "+Overtime);
System.out.print("\n    Total Income    : "+totalIncome);

System.out.print("\n    TAX             : "+tax);
System.out.print("\n    SSS             : "+SSS);
System.out.print("\n    Pagibig         : "+PGBG);
System.out.print("\n    PhilHealth      : "+PhilH);
System.out.println("\n    Total Deductions: "+deductions);
System.out.println("");
System.out.println("Others");
System.out.print("House Loan          : P");
HouseLoan = in.nextDouble();
System.out.print("Car Loan            : P");
CarLoan = in.nextDouble();
TotalLoan = HouseLoan+CarLoan;
System.out.println("Total Loan          : P"+TotalLoan);

GrossPay = totalIncome - deductions;
System.out.print("\n\n  TOTAL GROSS PAY     : P"+GrossPay);
NetPay= GrossPay - TotalLoan;
System.out.println("\n\n  TOTAL NET PAY       : P"+NetPay);

    break;
   
case 1002:
    System.out.println("Name              : "+name2);
    System.out.println("Position          : "+position2);
    System.out.println("Department        : "+department2);
    System.out.println("Status            : "+status2);
    System.out.println("Monthly Salary    : P"+MonthSal2);
    System.out.println("Allowances        : P"+allo2);
    System.out.print("Overtime          : ");
OverHrs1=in.nextDouble();
Overtime1= OverHrs1*HrsPay;
        System.out.println("OvertimePay       : P"+Overtime1);
totalIncome1 = MonthSal2 + allo2 + Overtime1;
        System.out.println("TOTAL INCOME      : P"+totalIncome1);
        
System.out.println("------------------------------------------------------");
System.out.println("                 D E D U C T I O N S                   ");
System.out.println("------------------------------------------------------");
        System.out.println("Number of Hours Works   : "+numworks);
        System.out.print("Late(Hr)                : ");
    hour =in.nextDouble();
        
totalhrs = hour*hourded;
        System.out.print("Late(Min)               : ");
        minute = in.nextDouble();
if (minute>=1 && minute<=55){
    minute = minuteded;
}
else if (minute==0){
    minute = minut;
}
late=minute+totalhrs;

        System.out.print("Absences                : ");
        abse = in.nextDouble();
        absetot = absehrs*abse;
        
        System.out.print("Undertime               : ");
        undertime = in.nextInt();
        undertot = undertime*underhrs;
        
     TotHrs = numworks-undertot-absetot-hour;
     System.out.println("Total Hours             : "+TotHrs);
     System.out.println("Rate                    : P"+rate1);
     totalIncome = TotHrs*rate1+allo2+Overtime1-late;
     System.out.println("Total Income            : P"+totalIncome1);
     
System.out.print("\nSpecify Tax Bracket \n\n");
System.out.print("(1)Single (2)Married (3)Widow");

System.out.print("\n\nEnter your choice: ");

sel=in.nextInt();
if(sel==1)
{
tax= totalIncome1*.15;
SSS= totalIncome1*.05;
PGBG= totalIncome1*.01;
PhilH= totalIncome1*.01;
deductions1= tax + SSS + PGBG + PhilH;

System.out.println("TAX             : "+tax);
System.out.println("SSS             : "+SSS);
System.out.println("PAGIBIG         : "+PGBG);
System.out.println("PhilHealth      : "+PhilH);
System.out.println("\n\n DEDUCTIONS     : "+deductions1);
}

else if(sel==2)
{
tax= totalIncome1*.10;
SSS= totalIncome1*.03;
PGBG= totalIncome1*.01;
PhilH= totalIncome1*.01;
deductions1= tax + SSS + PGBG + PhilH;

System.out.println("TAX             : "+tax);
System.out.println("SSS             : "+SSS);
System.out.println("PAGIBIG         : "+PGBG);
System.out.println("PhilHealth      : "+PhilH);
System.out.println("\n\n DEDUCTIONS     : "+deductions1);
}
else
{
tax= totalIncome1*.08;
SSS= totalIncome1*.02;
PGBG= totalIncome1*.01;
PhilH= totalIncome1*.01;
deductions1= tax + SSS + PGBG + PhilH;

System.out.println("TAX             : "+tax);
System.out.println("SSS             : "+SSS);
System.out.println("PAGIBIG         : "+PGBG);
System.out.println("PhilHealth      : "+PhilH);
System.out.println("\n\n DEDUCTIONS     : "+deductions1);
}
     
System.out.println("\n-------------------------------------------");
System.out.println("                Payroll Slip");
System.out.println("-------------------------------------------\n");
System.out.print("\n    Name            : "+name2);
System.out.print("\n    Position        : "+position2);
System.out.print("\n    Department      : "+department2);
System.out.print("\n    Status          : "+status2);
System.out.print("\n    Monthly Salary  : "+MonthSal2);
System.out.print("\n    Allowances      : "+allo2);
System.out.print("\n    Overtime        : "+Overtime1);
System.out.print("\n    Total Income    : "+totalIncome1);

System.out.print("\n    TAX             : "+tax);
System.out.print("\n    SSS             : "+SSS);
System.out.print("\n    Pagibig         : "+PGBG);
System.out.print("\n    PhilHealth      : "+PhilH);
System.out.println("\n    Total Deductions     : "+deductions1);
System.out.println("");
System.out.println("Others");
System.out.print("House Loan          : P");
HouseLoan = in.nextDouble();
System.out.print("Car Loan            : P");
CarLoan = in.nextDouble();
TotalLoan = HouseLoan+CarLoan;
System.out.println("Total Loan          : P"+TotalLoan);

GrossPay = totalIncome1 - deductions1;
System.out.print("\n\n  TOTAL GROSS PAY     : P"+GrossPay);
NetPay= GrossPay - TotalLoan;
System.out.println("\n\n  TOTAL NET PAY       : P"+NetPay);

    break;
    
case 1003:
    System.out.println("Name              : "+name3);
    System.out.println("Position          : "+position3);
    System.out.println("Department        : "+department3);
    System.out.println("Status            : "+status3);
    System.out.println("Monthly Salary    : P"+MonthSal3);
    System.out.println("Allowances        : P"+allo3);
    System.out.print("Overtime          : ");
OverHrs2=in.nextDouble();
Overtime2= OverHrs2*HrsPay;
        System.out.println("OvertimePay       : P"+Overtime2);
totalIncome2 = MonthSal3 + allo3 + Overtime2;
        System.out.println("TOTAL INCOME      : P"+totalIncome2);
        
System.out.println("------------------------------------------------------");
System.out.println("                 D E D U C T I O N S                   ");
System.out.println("------------------------------------------------------");
        System.out.println("Number of Hours Works   : "+numworks);
        System.out.print("Late(Hr)                : ");
    hour =in.nextDouble();
        
totalhrs = hour*hourded;
        System.out.print("Late(Min)               : ");
        minute = in.nextDouble();
if (minute>=1 && minute<=55){
    minute = minuteded;
}
else if (minute==0){
    minute = minut;
}
late=minute+totalhrs;

        System.out.print("Absences                : ");
        abse = in.nextDouble();
        absetot = absehrs*abse;
        
        System.out.print("Undertime               : ");
        undertime = in.nextInt();
        undertot = undertime*underhrs;
        
     TotHrs = numworks-undertot-absetot-hour;
     System.out.println("Total Hours             : "+TotHrs);
     System.out.println("Rate                    : P"+rate2);
     totalIncome2 = TotHrs*rate2+allo3+Overtime2-late;
     System.out.println("Total Income            : P"+totalIncome2);
     
System.out.print("\nSpecify Tax Bracket \n\n");
System.out.print("(1)Single (2)Married (3)Widow");

System.out.print("\n\nEnter your choice: ");

sel=in.nextInt();
if(sel==1)
{
tax= totalIncome2*.20;
SSS= totalIncome2*.07;
PGBG= totalIncome2*.01;
PhilH= totalIncome2*.01;
deductions2= tax + SSS + PGBG + PhilH;

System.out.println("TAX             : "+tax);
System.out.println("SSS             : "+SSS);
System.out.println("PAGIBIG         : "+PGBG);
System.out.println("PhilHealth      : "+PhilH);
System.out.println("\n\n DEDUCTIONS     : "+deductions2);
}

else if(sel==2)
{
tax= totalIncome2*.10;
SSS= totalIncome2*.03;
PGBG= totalIncome2*.01;
PhilH= totalIncome2*.01;
deductions2= tax + SSS + PGBG + PhilH;

System.out.println("TAX             : "+tax);
System.out.println("SSS             : "+SSS);
System.out.println("PAGIBIG         : "+PGBG);
System.out.println("PhilHealth      : "+PhilH);
System.out.println("\n\n DEDUCTIONS     : "+deductions2);
}
else
{
tax= totalIncome2*.08;
SSS= totalIncome2*.02;
PGBG= totalIncome2*.01;
PhilH= totalIncome2*.01;
deductions2= tax + SSS + PGBG + PhilH;

System.out.println("TAX             : "+tax);
System.out.println("SSS             : "+SSS);
System.out.println("PAGIBIG         : "+PGBG);
System.out.println("PhilHealth      : "+PhilH);
System.out.println("\n\n DEDUCTIONS     : "+deductions2);
}
     
System.out.println("\n-------------------------------------------");
System.out.println("                Payroll Slip");
System.out.println("-------------------------------------------\n");
System.out.print("\n    Name            : "+name3);
System.out.print("\n    Position        : "+position3);
System.out.print("\n    Department      : "+department3);
System.out.print("\n    Status          : "+status3);
System.out.print("\n    Monthly Salary  : "+MonthSal3);
System.out.print("\n    Allowances      : "+allo3);
System.out.print("\n    Overtime        : "+Overtime2);
System.out.print("\n    Total Income    : "+totalIncome2);

System.out.print("\n    TAX             : "+tax);
System.out.print("\n    SSS             : "+SSS);
System.out.print("\n    Pagibig         : "+PGBG);
System.out.print("\n    PhilHealth      : "+PhilH);
System.out.println("\n    Total Deductions: "+deductions2);
System.out.println("");
System.out.println("Others");
System.out.print("House Loan          : P");
HouseLoan = in.nextDouble();
System.out.print("Car Loan            : P");
CarLoan = in.nextDouble();
TotalLoan = HouseLoan+CarLoan;
System.out.println("Total Loan          : P"+TotalLoan);

GrossPay = totalIncome2 - deductions2;
System.out.print("\n\n  TOTAL GROSS PAY     : P"+GrossPay);
NetPay= GrossPay - TotalLoan;
System.out.println("\n\n  TOTAL NET PAY       : P"+NetPay);

    break;
    
case 1004:
    System.out.println("Name              : "+name4);
    System.out.println("Position          : "+position4);
    System.out.println("Department        : "+department4);
    System.out.println("Status            : "+status4);
    System.out.println("Monthly Salary    : P"+MonthSal4);
    System.out.println("Allowances        : P"+allo4);
    System.out.print("Overtime          : ");
OverHrs3=in.nextDouble();
Overtime3= OverHrs3*HrsPay;
        System.out.println("OvertimePay       : P"+Overtime3);
totalIncome3 = MonthSal4 + allo4 + Overtime3;
        System.out.println("TOTAL INCOME      : P"+totalIncome3);
        
System.out.println("------------------------------------------------------");
System.out.println("                 D E D U C T I O N S                   ");
System.out.println("------------------------------------------------------");
        System.out.println("Number of Hours Works   : "+numworks);
        System.out.print("Late(Hr)                : ");
    hour =in.nextDouble();
        
totalhrs = hour*hourded;
        System.out.print("Late(Min)               : ");
        minute = in.nextDouble();
if (minute>=1 && minute<=55){
    minute = minuteded;
}
else if (minute==0){
    minute = minut;
}
late=minute+totalhrs;

        System.out.print("Absences                : ");
        abse = in.nextDouble();
        absetot = absehrs*abse;
        
        System.out.print("Undertime               : ");
        undertime = in.nextInt();
        undertot = undertime*underhrs;
        
     TotHrs = numworks-undertot-absetot-hour;
     System.out.println("Total Hours             : "+TotHrs);
     System.out.println("Rate                    : P"+rate3);
     totalIncome3 = TotHrs*rate3+allo4+Overtime3-late;
     System.out.println("Total Income            : P"+totalIncome3);
     
System.out.print("\nSpecify Tax Bracket \n\n");
System.out.print("(1)Single (2)Married (3)Widow");

System.out.print("\n\nEnter your choice: ");

sel=in.nextInt();
if(sel==1)
{
tax= totalIncome3*.20;
SSS= totalIncome3*.07;
PGBG= totalIncome3*.01;
PhilH= totalIncome3*.01;
deductions3= tax + SSS + PGBG + PhilH;

System.out.println("TAX             : "+tax);
System.out.println("SSS             : "+SSS);
System.out.println("PAGIBIG         : "+PGBG);
System.out.println("PhilHealth      : "+PhilH);
System.out.println("\n\n DEDUCTIONS     : "+deductions3);
}

else if(sel==2)
{
tax= totalIncome3*.10;
SSS= totalIncome3*.03;
PGBG= totalIncome3*.01;
PhilH= totalIncome3*.01;
deductions3= tax + SSS + PGBG + PhilH;

System.out.println("TAX             : "+tax);
System.out.println("SSS             : "+SSS);
System.out.println("PAGIBIG         : "+PGBG);
System.out.println("PhilHealth      : "+PhilH);
System.out.println("\n\n DEDUCTIONS     : "+deductions3);
}
else
{
tax= totalIncome3*.08;
SSS= totalIncome3*.02;
PGBG= totalIncome3*.01;
PhilH= totalIncome3*.01;
deductions3= tax + SSS + PGBG + PhilH;

System.out.println("TAX             : "+tax);
System.out.println("SSS             : "+SSS);
System.out.println("PAGIBIG         : "+PGBG);
System.out.println("PhilHealth      : "+PhilH);
System.out.println("\n\n DEDUCTIONS     : "+deductions3);
}
     
System.out.println("\n-------------------------------------------");
System.out.println("                Payroll Slip");
System.out.println("-------------------------------------------\n");
System.out.print("\n    Name            : "+name4);
System.out.print("\n    Position        : "+position4);
System.out.print("\n    Department      : "+department4);
System.out.print("\n    Status          : "+status4);
System.out.print("\n    Monthly Salary  : "+MonthSal4);
System.out.print("\n    Allowances      : "+allo4);
System.out.print("\n    Overtime        : "+Overtime3);
System.out.print("\n    Total Income    : "+totalIncome3);

System.out.print("\n    TAX             : "+tax);
System.out.print("\n    SSS             : "+SSS);
System.out.print("\n    Pagibig         : "+PGBG);
System.out.print("\n    PhilHealth      : "+PhilH);
System.out.println("\n    Total Deductions: "+deductions3);
System.out.println("");
        System.out.println("Others");
        System.out.print("House Loan          : P");
        HouseLoan = in.nextDouble();
        System.out.print("Car Loan            : P");
        CarLoan = in.nextDouble();
    TotalLoan = HouseLoan+CarLoan;
        System.out.println("Total Loan          : P"+TotalLoan);

    GrossPay = totalIncome3 - deductions3;
        System.out.print("\n\n  TOTAL GROSS PAY     : P"+GrossPay);
    NetPay= GrossPay - TotalLoan;
        System.out.println("\n\n  TOTAL NET PAY       : P"+NetPay);

    break;
    
default:
	System.out.println("\t\t   You Input Invalid Number...");
	System.out.println("\t\t   The Valid Numbers are 1001, 1002, 1003, and 1004 Only!");
}
System.out.print("\n You want to Select Again[Y/N]: ");
ans = (char) System.in.read();

}while (ans == 'Y' || ans == 'y');
}
}