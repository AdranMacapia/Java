/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package group16_payroll_c2021;

/**
 *
 * @author HEXA
 */
import java.io.IOException;
import java.util.*;

public class Group16_Payroll_C2021 {

    public static void main(String[] args) throws IOException {

        String name1 = "Jose Rizal A", position1 = "Manager", department1 = "IT", status1 = "Single";
        double deductions = 0, totalIncome, Overtime, Overhours, HoursPay = 350, Monthly1 = 99840, Allowances1 = 4500, HouseLoan, CarLoan, TotalLoan, GrossPay;

        double numworks = 192, late, Absences, Absenceshours = 8, Absencestotal, Tothours, rate = 520, minuteded = 50, minute, minut = 0, hourded = 150, hour, Totalhours;
        int undertime, Undertotal, Underhours = 4;

        double tax = 0, SSS = 0, PhilH = 0, PGBG = 0, NetPay, OverallIncome, OverallIncome2, OverallIncome3, OverallIncome4;

        String name2 = "Andres Bonifacio C", position2 = "Assistant Manager", department2 = "IT", status2 = "Single";
        double deductions1 = 0, totalIncome1, Overtime1, Overhours1, Monthly2 = 86400, Allowances2 = 2500;

        double rate1 = 450;

        String name3 = "Lexi Lore S", position3 = "Secretary", department3 = "IT", status3 = "Married";
        double deductions2 = 0, totalIncome2, Overtime2, Overhours2, Monthly3 = 67200, Allowances3 = 1500;

        double rate2 = 350;

        String name4 = "Ivana Alawi S", position4 = "Assistant Secretary", department4 = "IT", status4 = "Widowed";
        double deductions3 = 0, totalIncome3, Overtime3, Overhours3, Monthly4 = 57600, Allowances4 = 1000;

        double rate3 = 300;

        int sel, Employee;
        
        char ans;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("\n");
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("                                         TAGUIG CITY Payroll System 101");
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("|Employee|    Employee Name     |    Position     | Department | rate   | Monthly | Allowances| Official     |");
            System.out.println("|Number  |                      |                 |            | /hour  | Salary  |           | time= 8hours |");
            System.out.println("|        |                      |                 |            |        |         |           |Overtime      |");
            System.out.println("|        |                      |                 |            |        |         |           |exceeding     | ");
            System.out.println("|        |                      |                 |            |        |         |           |1 hour=P350   |");
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("| 1001   | Jose Rizal A         | Manager         |     IT     |  520   | 99,840  |  4,500    |              |");
            System.out.println("| 1002   | Andres Bonifacio C   | Asst. Manager   |     IT     |  450   | 86,400  |  2,500    |              |");
            System.out.println("| 1003   | Lexi Lore S          | Secretary       |     IT     |  350   | 67,200  |  1,500    |              |");
            System.out.println("| 1004   | Ivana Alawi S        | Asst. Secretary |     IT     |  300   | 57,600  |  1,000    |              |");
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("Enter Employee's Data \n");

            System.out.print("Employee Number   : ");
            Employee = in.nextInt();

            switch (Employee) {
                case 1001:
                    System.out.println("Name              : " + name1);
                    System.out.println("Position          : " + position1);
                    System.out.println("Department        : " + department1);
                    System.out.println("Status            : " + status1);
                    System.out.println("Monthly Salary    : P" + Monthly1);
                    System.out.println("Allowances        : P" + Allowances1);
                    System.out.print("Overtime          : ");
                    Overhours = in.nextDouble();
                    Overtime = Overhours * HoursPay;
                    System.out.println("OvertimePay       : P" + Overtime);
                    totalIncome = Monthly1 + Allowances1 + Overtime;
                    System.out.println("TOTAL INCOME      : P" + totalIncome);

                    System.out.println("------------------------------------------------------");
                    System.out.println("                    T  I   M   E                   ");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Number of Hours Works   : " + numworks);
                    System.out.print("Late(Hours)             : ");
                    hour = in.nextDouble();
                    Totalhours = hour * hourded;

                    System.out.print("Late(Minutes)           : ");
                    minute = in.nextDouble();
                    if (minute >= 1 && minute <= 59) {
                        minute = minuteded;
                    } else if (minute == 0) {
                        minute = minut;
                    }
                    late = minute + Totalhours;

                    System.out.print("Absences                : ");
                    Absences = in.nextDouble();
                    Absencestotal = Absenceshours * Absences;

                    System.out.print("Undertime               : ");
                    undertime = in.nextInt();
                    Undertotal = undertime * Underhours;

                    Tothours = numworks - Undertotal - Absencestotal - hour;
                    System.out.println("Total Hours             : " + Tothours);
                    System.out.println("Rate                    : P" + rate);
                    OverallIncome = Tothours * rate + Allowances1 + Overtime - late;
                    System.out.println("OVERALL INCOME          : P" + OverallIncome);

                    System.out.println("------------------------------------------------------");
                    System.out.println("                 D E D U C T I O N S                   ");
                    System.out.println("------------------------------------------------------");

                    System.out.print("Specify Tax Bracket \n");
                    System.out.print("(1)Single (2)Married (3)Widowed");

                    System.out.print("\n\nEnter your choice: ");

                    while (true) {
                        sel = in.nextInt();
                        if (sel < 1 || sel > 1) {
                            System.out.print("You select wrong number, please enter the number you choose[1,2,3 only!]: ");

                            continue;
                        }
                        break;
                    }
                    if (sel == 1) {
                        tax = OverallIncome * .20;
                        SSS = OverallIncome * .07;
                        PGBG = OverallIncome * .01;
                        PhilH = OverallIncome * .01;
                        deductions = tax + SSS + PGBG + PhilH;

                        System.out.println("\nTAX              : P" + tax);
                        System.out.println("SSS              : P" + SSS);
                        System.out.println("PAGIBIG          : P" + PGBG);
                        System.out.println("PhilHealth       : P" + PhilH);
                        System.out.println("\nDEDUCTIONS       : P" + deductions);
                    } else if (sel == 2) {
                        tax = OverallIncome * .10;
                        SSS = OverallIncome * .03;
                        PGBG = OverallIncome * .01;
                        PhilH = OverallIncome * .01;
                        deductions = tax + SSS + PGBG + PhilH;

                        System.out.println("\nTAX              : P" + tax);
                        System.out.println("SSS              : P" + SSS);
                        System.out.println("PAGIBIG          : P" + PGBG);
                        System.out.println("PhilHealth       : P" + PhilH);
                        System.out.println("\nDEDUCTIONS       : P" + deductions);
                    } else if (sel == 3) {
                        tax = OverallIncome * .08;
                        SSS = OverallIncome * .02;
                        PGBG = OverallIncome * .01;
                        PhilH = OverallIncome * .01;
                        deductions = tax + SSS + PGBG + PhilH;

                        System.out.println("\nTAX              : P" + tax);
                        System.out.println("SSS              : P" + SSS);
                        System.out.println("PAGIBIG          : P" + PGBG);
                        System.out.println("PhilHealth       : P" + PhilH);
                        System.out.println("\nDEDUCTIONS       : P" + deductions);
                    }

                    System.out.println("\n-------------------------------------------------");
                    System.out.println("                  Payroll Slip");
                    System.out.println("-------------------------------------------------");
                    System.out.print("\n    Name                 : " + name1);
                    System.out.print("\n    Position             : " + position1);
                    System.out.print("\n    Department           : " + department1);
                    System.out.print("\n    Status               : " + status1);
                    System.out.print("\n    Monthly Salary       : P" + Monthly1);
                    System.out.print("\n    Allowances           : P" + Allowances1);
                    System.out.print("\n    Overtime             : P" + Overtime);
                    System.out.print("\n    Total Income         : P" + totalIncome);
                    System.out.println("\n");
                    System.out.println("----------------------Time-----------------------");
                    System.out.print("\n    Number of Hours Works: " + numworks);
                    System.out.print("\n    Late(hours)          : P" + Totalhours);
                    System.out.print("\n    Late(minutes)        : P" + minute);
                    System.out.print("\n    Absences             : " + Absencestotal);
                    System.out.print("\n    Undertime            : " + Undertotal);
                    System.out.print("\n    Total Hours          : " + Tothours);
                    System.out.print("\n    Rate                 : P" + rate);
                    System.out.print("\n    Overall Income       : P" + OverallIncome);
                    System.out.println("\n");
                    System.out.println("-------------------Deductions--------------------");
                    System.out.print("\n    TAX                  : P" + tax);
                    System.out.print("\n    SSS                  : P" + SSS);
                    System.out.print("\n    Pagibig              : P" + PGBG);
                    System.out.print("\n    PhilHealth           : P" + PhilH);
                    System.out.println("\n    Total Deductions     : P" + deductions);
                    System.out.println("");
                    System.out.println("---------------------Others----------------------");
                    System.out.print("\n    House Loan           : P");
                    HouseLoan = in.nextDouble();
                    System.out.print("    Car Loan             : P");
                    CarLoan = in.nextDouble();
                    TotalLoan = HouseLoan + CarLoan;
                    System.out.println("    Total Loan           : P" + TotalLoan);
                    System.out.println("");
                    System.out.println("-------------------------------------------------");
                    GrossPay = OverallIncome - deductions;
                    System.out.print("\n  TOTAL GROSS PAY        : P" + GrossPay);
                    NetPay = GrossPay - TotalLoan;
                    System.out.println("\n\n  TOTAL NET PAY          : P" + NetPay);

                    break;

                case 1002:
                    System.out.println("Name              : " + name2);
                    System.out.println("Position          : " + position2);
                    System.out.println("Department        : " + department2);
                    System.out.println("Status            : " + status2);
                    System.out.println("Monthly Salary    : P" + Monthly2);
                    System.out.println("Allowances        : P" + Allowances2);
                    System.out.print("Overtime          : ");
                    Overhours1 = in.nextDouble();
                    Overtime1 = Overhours1 * HoursPay;
                    System.out.println("OvertimePay       : P" + Overtime1);
                    totalIncome1 = Monthly2 + Allowances2 + Overtime1;
                    System.out.println("TOTAL INCOME      : P" + totalIncome1);

                    System.out.println("------------------------------------------------------");
                    System.out.println("                    T  I   M   E                   ");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Number of Hours Works   : " + numworks);
                    System.out.print("Late(Hours)             : ");
                    hour = in.nextDouble();
                    Totalhours = hour * hourded;

                    System.out.print("Late(Minutes)           : ");
                    minute = in.nextDouble();
                    if (minute >= 1 && minute <= 59) {
                        minute = minuteded;
                    } else if (minute == 0) {
                        minute = minut;
                    }
                    late = minute + Totalhours;

                    System.out.print("Absences                : ");
                    Absences = in.nextDouble();
                    Absencestotal = Absenceshours * Absences;

                    System.out.print("Undertime               : ");
                    undertime = in.nextInt();
                    Undertotal = undertime * Underhours;

                    Tothours = numworks - Undertotal - Absencestotal - hour;
                    System.out.println("Total Hours             : " + Tothours);
                    System.out.println("Rate                    : P" + rate1);
                    OverallIncome2 = Tothours * rate1 + Allowances2 + Overtime1 - late;
                    System.out.println("OVERALL INCOME          : P" + OverallIncome2);

                    System.out.println("------------------------------------------------------");
                    System.out.println("                 D E D U C T I O N S                   ");
                    System.out.println("------------------------------------------------------");

                    System.out.print("Specify Tax Bracket \n");
                    System.out.print("(1)Single (2)Married (3)Widowed");

                    System.out.print("\n\nEnter your choice: ");

                    while (true) {
                        sel = in.nextInt();
                        if (sel < 1 || sel > 3) {
                            System.out.print("You select wrong number, please enter the number you choose[1,2,3 only!]: ");

                            continue;
                        }
                        break;
                    }
                    if (sel == 1) {
                        tax = OverallIncome2 * .15;
                        SSS = OverallIncome2 * .05;
                        PGBG = OverallIncome2 * .01;
                        PhilH = OverallIncome2 * .01;
                        deductions1 = tax + SSS + PGBG + PhilH;

                        System.out.println("\nTAX              : P" + tax);
                        System.out.println("SSS              : P" + SSS);
                        System.out.println("PAGIBIG          : P" + PGBG);
                        System.out.println("PhilHealth       : P" + PhilH);
                        System.out.println("\nDEDUCTIONS       : P" + deductions1);
                    } else if (sel == 2) {
                        tax = OverallIncome2 * .10;
                        SSS = OverallIncome2 * .03;
                        PGBG = OverallIncome2 * .01;
                        PhilH = OverallIncome2 * .01;
                        deductions1 = tax + SSS + PGBG + PhilH;

                        System.out.println("\nTAX              : P" + tax);
                        System.out.println("SSS              : P" + SSS);
                        System.out.println("PAGIBIG          : P" + PGBG);
                        System.out.println("PhilHealth       : P" + PhilH);
                        System.out.println("\nDEDUCTIONS       : P" + deductions1);
                    } else if (sel == 3) {
                        tax = OverallIncome2 * .08;
                        SSS = OverallIncome2 * .02;
                        PGBG = OverallIncome2 * .01;
                        PhilH = OverallIncome2 * .01;
                        deductions1 = tax + SSS + PGBG + PhilH;

                        System.out.println("\nTAX              : P" + tax);
                        System.out.println("SSS              : P" + SSS);
                        System.out.println("PAGIBIG          : P" + PGBG);
                        System.out.println("PhilHealth       : P" + PhilH);
                        System.out.println("\nDEDUCTIONS       : P" + deductions1);
                    }

                    System.out.println("\n-------------------------------------------------");
                    System.out.println("                  Payroll Slip");
                    System.out.println("-------------------------------------------------");
                    System.out.print("\n    Name                 : " + name2);
                    System.out.print("\n    Position             : " + position2);
                    System.out.print("\n    Department           : " + department2);
                    System.out.print("\n    Status               : " + status2);
                    System.out.print("\n    Monthly Salary       : P" + Monthly2);
                    System.out.print("\n    Allowances           : P" + Allowances2);
                    System.out.print("\n    Overtime             : P" + Overtime1);
                    System.out.print("\n    Total Income         : P" + totalIncome1);
                    System.out.println("\n");
                    System.out.println("----------------------Time-----------------------");
                    System.out.print("\n    Number of Hours Works: " + numworks);
                    System.out.print("\n    Late(hours)          : P" + Totalhours);
                    System.out.print("\n    Late(minutes)        : P" + minute);
                    System.out.print("\n    Absences             : " + Absencestotal);
                    System.out.print("\n    Undertime            : " + Undertotal);
                    System.out.print("\n    Total Hours          : " + Tothours);
                    System.out.print("\n    Rate                 : P" + rate1);
                    System.out.print("\n    Overall Income       : P" + OverallIncome2);
                    System.out.println("\n");
                    System.out.println("-------------------Deductions--------------------");
                    System.out.print("\n    TAX                  : P" + tax);
                    System.out.print("\n    SSS                  : P" + SSS);
                    System.out.print("\n    Pagibig              : P" + PGBG);
                    System.out.print("\n    PhilHealth           : P" + PhilH);
                    System.out.println("\n    Total Deductions     : P" + deductions1);
                    System.out.println("");
                    System.out.println("---------------------Others----------------------");
                    System.out.print("\n    House Loan           : P");
                    HouseLoan = in.nextDouble();
                    System.out.print("    Car Loan             : P");
                    CarLoan = in.nextDouble();
                    TotalLoan = HouseLoan + CarLoan;
                    System.out.println("    Total Loan           : P" + TotalLoan);
                    System.out.println("");
                    System.out.println("-------------------------------------------------");
                    GrossPay = totalIncome1 - deductions1;
                    System.out.print("\n  TOTAL GROSS PAY       : P" + GrossPay);
                    NetPay = GrossPay - TotalLoan;
                    System.out.println("\n\n  TOTAL NET PAY         : P" + NetPay);

                    break;

                case 1003:
                    System.out.println("Name              : " + name3);
                    System.out.println("Position          : " + position3);
                    System.out.println("Department        : " + department3);
                    System.out.println("Status            : " + status3);
                    System.out.println("Monthly Salary    : P" + Monthly3);
                    System.out.println("Allowances        : P" + Allowances3);
                    System.out.print("Overtime          : ");
                    Overhours2 = in.nextDouble();
                    Overtime2 = Overhours2 * HoursPay;
                    System.out.println("OvertimePay       : P" + Overtime2);
                    totalIncome2 = Monthly3 + Allowances3 + Overtime2;
                    System.out.println("TOTAL INCOME      : P" + totalIncome2);

                    System.out.println("------------------------------------------------------");
                    System.out.println("                    T  I   M   E                   ");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Number of Hours Works   : " + numworks);
                    System.out.print("Late(Hours)             : ");
                    hour = in.nextDouble();
                    Totalhours = hour * hourded;

                    System.out.print("Late(Minutes)           : ");
                    minute = in.nextDouble();
                    if (minute >= 1 && minute <= 59) {
                        minute = minuteded;
                    } else if (minute == 0) {
                        minute = minut;
                    }
                    late = minute + Totalhours;

                    System.out.print("Absences                : ");
                    Absences = in.nextDouble();
                    Absencestotal = Absenceshours * Absences;

                    System.out.print("Undertime               : ");
                    undertime = in.nextInt();
                    Undertotal = undertime * Underhours;

                    Tothours = numworks - Undertotal - Absencestotal - hour;
                    System.out.println("Total Hours             : " + Tothours);
                    System.out.println("Rate                    : P" + rate2);
                    OverallIncome3 = Tothours * rate2 + Allowances3 + Overtime2 - late;
                    System.out.println("OVERALL INCOME          : P" + OverallIncome3);

                    System.out.println("------------------------------------------------------");
                    System.out.println("                 D E D U C T I O N S                   ");
                    System.out.println("------------------------------------------------------");

                    System.out.print("Specify Tax Bracket \n");
                    System.out.print("(1)Single (2)Married (3)Widowed");

                    System.out.print("\n\nEnter your choice: ");

                    while (true) {
                        sel = in.nextInt();
                        if (sel < 1 || sel > 3) {
                            System.out.print("You select wrong number, please enter the number you choose[1,2,3 only!]: ");

                            continue;
                        }
                        break;
                    }
                    if (sel == 1) {
                        tax = OverallIncome3 * .20;
                        SSS = OverallIncome3 * .07;
                        PGBG = OverallIncome3 * .01;
                        PhilH = OverallIncome3 * .01;
                        deductions2 = tax + SSS + PGBG + PhilH;

                        System.out.println("TAX              : P" + tax);
                        System.out.println("SSS              : P" + SSS);
                        System.out.println("PAGIBIG          : P" + PGBG);
                        System.out.println("PhilHealth       : P" + PhilH);
                        System.out.println("\nDEDUCTIONS       : P" + deductions2);
                    } else if (sel == 2) {
                        tax = OverallIncome3 * .10;
                        SSS = OverallIncome3 * .03;
                        PGBG = OverallIncome3 * .01;
                        PhilH = OverallIncome3 * .01;
                        deductions2 = tax + SSS + PGBG + PhilH;

                        System.out.println("\nTAX              : P" + tax);
                        System.out.println("SSS              : P" + SSS);
                        System.out.println("PAGIBIG          : P" + PGBG);
                        System.out.println("PhilHealth       : P" + PhilH);
                        System.out.println("\nDEDUCTIONS       : P" + deductions2);
                    } else if (sel == 3) {
                        tax = OverallIncome3 * .08;
                        SSS = OverallIncome3 * .02;
                        PGBG = OverallIncome3 * .01;
                        PhilH = OverallIncome3 * .01;
                        deductions2 = tax + SSS + PGBG + PhilH;

                        System.out.println("\nTAX              : P" + tax);
                        System.out.println("SSS              : P" + SSS);
                        System.out.println("PAGIBIG          : P" + PGBG);
                        System.out.println("PhilHealth       : P" + PhilH);
                        System.out.println("\nDEDUCTIONS       : P" + deductions2);
                    }

                    System.out.println("\n-------------------------------------------------");
                    System.out.println("                  Payroll Slip");
                    System.out.println("-------------------------------------------------");
                    System.out.print("\n    Name                 : " + name3);
                    System.out.print("\n    Position             : " + position3);
                    System.out.print("\n    Department           : " + department3);
                    System.out.print("\n    Status               : " + status3);
                    System.out.print("\n    Monthly Salary       : P" + Monthly3);
                    System.out.print("\n    Allowances           : P" + Allowances3);
                    System.out.print("\n    Overtime             : P" + Overtime2);
                    System.out.print("\n    Total Income         : P" + totalIncome2);
                    System.out.println("\n");
                    System.out.println("----------------------Time-----------------------");
                    System.out.print("\n    Number of Hours Works: " + numworks);
                    System.out.print("\n    Late(hours)             : P" + Totalhours);
                    System.out.print("\n    Late(minutes)            : P" + minute);
                    System.out.print("\n    Absences             : " + Absencestotal);
                    System.out.print("\n    Undertime            : " + Undertotal);
                    System.out.print("\n    Total Hours          : " + Tothours);
                    System.out.print("\n    Rate                 : P" + rate2);
                    System.out.print("\n    Overall Income       : P" + OverallIncome3);
                    System.out.println("\n");
                    System.out.println("-------------------Deductions--------------------");
                    System.out.print("\n    TAX                  : P" + tax);
                    System.out.print("\n    SSS                  : P" + SSS);
                    System.out.print("\n    Pagibig              : P" + PGBG);
                    System.out.print("\n    PhilHealth           : P" + PhilH);
                    System.out.println("\n    Total Deductions     : P" + deductions2);
                    System.out.println("");
                    System.out.println("---------------------Others----------------------");
                    System.out.print("\n    House Loan           : P");
                    HouseLoan = in.nextDouble();
                    System.out.print("    Car Loan             : P");
                    CarLoan = in.nextDouble();
                    TotalLoan = HouseLoan + CarLoan;
                    System.out.println("    Total Loan           : P" + TotalLoan);
                    System.out.println("");
                    System.out.println("-------------------------------------------------");
                    GrossPay = totalIncome2 - deductions2;
                    System.out.print("\n  TOTAL GROSS PAY        : P" + GrossPay);
                    NetPay = GrossPay - TotalLoan;
                    System.out.println("\n\n  TOTAL NET PAY          : P" + NetPay);

                    break;

                case 1004:
                    System.out.println("Name              : " + name4);
                    System.out.println("Position          : " + position4);
                    System.out.println("Department        : " + department4);
                    System.out.println("Status            : " + status4);
                    System.out.println("Monthly Salary    : P" + Monthly4);
                    System.out.println("Allowances        : P" + Allowances4);
                    System.out.print("Overtime          : ");
                    Overhours3 = in.nextDouble();
                    Overtime3 = Overhours3 * HoursPay;
                    System.out.println("OvertimePay       : P" + Overtime3);
                    totalIncome3 = Monthly4 + Allowances4 + Overtime3;
                    System.out.println("TOTAL INCOME      : P" + totalIncome3);

                    System.out.println("------------------------------------------------------");
                    System.out.println("                    T  I   M   E                   ");
                    System.out.println("------------------------------------------------------");
                    System.out.println("Number of Hours Works   : " + numworks);
                    System.out.print("Late(Hours)             : ");
                    hour = in.nextDouble();
                    Totalhours = hour * hourded;

                    System.out.print("Late(Minutes)           : ");
                    minute = in.nextDouble();
                    if (minute >= 1 && minute <= 59) {
                        minute = minuteded;
                    } else if (minute == 0) {
                        minute = minut;
                    }
                    late = minute + Totalhours;

                    System.out.print("Absences                : ");
                    Absences = in.nextDouble();
                    Absencestotal = Absenceshours * Absences;

                    System.out.print("Undertime               : ");
                    undertime = in.nextInt();
                    Undertotal = undertime * Underhours;

                    Tothours = numworks - Undertotal - Absencestotal - hour;
                    System.out.println("Total Hours             : " + Tothours);
                    System.out.println("Rate                    : P" + rate3);
                    OverallIncome4 = Tothours * rate3 + Allowances4 + Overtime3 - late;
                    System.out.println("OVERALL INCOME          : P" + OverallIncome4);

                    System.out.println("------------------------------------------------------");
                    System.out.println("                 D E D U C T I O N S                   ");
                    System.out.println("------------------------------------------------------");

                    System.out.print("Specify Tax Bracket \n");
                    System.out.print("(1)Single (2)Married (3)Widowed");

                    System.out.print("\n\nEnter your choice: ");

                    while (true) {
                        sel = in.nextInt();
                        if (sel < 1 || sel > 3) {
                            System.out.print("You select wrong number, please enter the number you choose[1,2,3 only!]: ");

                            continue;
                        }
                        break;
                    }
                    if (sel == 1) {
                        tax = OverallIncome4 * .20;
                        SSS = OverallIncome4 * .07;
                        PGBG = OverallIncome4 * .01;
                        PhilH = OverallIncome4 * .01;
                        deductions3 = tax + SSS + PGBG + PhilH;

                        System.out.println("TAX              : P" + tax);
                        System.out.println("SSS              : P" + SSS);
                        System.out.println("PAGIBIG          : P" + PGBG);
                        System.out.println("PhilHealth       : P" + PhilH);
                        System.out.println("\nDEDUCTIONS       : P" + deductions3);
                    } else if (sel == 2) {
                        tax = OverallIncome4 * .10;
                        SSS = OverallIncome4 * .03;
                        PGBG = OverallIncome4 * .01;
                        PhilH = OverallIncome4 * .01;
                        deductions3 = tax + SSS + PGBG + PhilH;

                        System.out.println("\nTAX              : P" + tax);
                        System.out.println("SSS              : P" + SSS);
                        System.out.println("PAGIBIG          : P" + PGBG);
                        System.out.println("PhilHealth       : P" + PhilH);
                        System.out.println("\nDEDUCTIONS       : P" + deductions3);
                    } else if (sel == 3) {
                        tax = OverallIncome4 * .08;
                        SSS = OverallIncome4 * .02;
                        PGBG = OverallIncome4 * .01;
                        PhilH = OverallIncome4 * .01;
                        deductions3 = tax + SSS + PGBG + PhilH;

                        System.out.println("\nTAX              : P" + tax);
                        System.out.println("SSS              : P" + SSS);
                        System.out.println("PAGIBIG          : P" + PGBG);
                        System.out.println("PhilHealth       : P" + PhilH);
                        System.out.println("\nDEDUCTIONS       : P" + deductions3);
                    }

                    System.out.println("\n-------------------------------------------------");
                    System.out.println("                  Payroll Slip");
                    System.out.println("-------------------------------------------------");
                    System.out.print("\n    Name                 : " + name4);
                    System.out.print("\n    Position             : " + position4);
                    System.out.print("\n    Department           : " + department4);
                    System.out.print("\n    Status               : " + status4);
                    System.out.print("\n    Monthly Salary       : P" + Monthly4);
                    System.out.print("\n    Allowances           : P" + Allowances4);
                    System.out.print("\n    Overtime             : P" + Overtime3);
                    System.out.print("\n    Total Income         : P" + totalIncome3);
                    System.out.println("\n");
                    System.out.println("----------------------Time-----------------------");
                    System.out.print("\n    Number of Hours Works: " + numworks);
                    System.out.print("\n    Late(hours)             : P" + Totalhours);
                    System.out.print("\n    Late(minutes)            : P" + minute);
                    System.out.print("\n    Absences             : " + Absencestotal);
                    System.out.print("\n    Undertime            : " + Undertotal);
                    System.out.print("\n    Total Hours          : " + Tothours);
                    System.out.print("\n    Rate                 : P" + rate3);
                    System.out.print("\n    Overall Income       : P" + OverallIncome4);
                    System.out.println("\n");
                    System.out.println("-------------------Deductions--------------------");
                    System.out.print("\n    TAX                  : P" + tax);
                    System.out.print("\n    SSS                  : P" + SSS);
                    System.out.print("\n    Pagibig              : P" + PGBG);
                    System.out.print("\n    PhilHealth           : P" + PhilH);
                    System.out.println("\n    Total Deductions     : P" + deductions3);
                    System.out.println("");
                    System.out.println("---------------------Others----------------------");
                    System.out.print("\n    House Loan           : P");
                    HouseLoan = in.nextDouble();
                    System.out.print("    Car Loan             : P");
                    CarLoan = in.nextDouble();
                    TotalLoan = HouseLoan + CarLoan;
                    System.out.println("    Total Loan           : P" + TotalLoan);
                    System.out.println("");
                    System.out.println("-------------------------------------------------");
                    GrossPay = totalIncome3 - deductions3;
                    System.out.print("\n  TOTAL GROSS PAY        : P" + GrossPay);
                    NetPay = GrossPay - TotalLoan;
                    System.out.println("\n\n  TOTAL NET PAY          : P" + NetPay);

                    break;

                default:
                    System.out.println("\t\t   You Input Invalid Number...");
                    System.out.println("\t\t   The Valid Numbers are 1001, 1002, 1003, and 1004 Only!");
            }
            System.out.print("\n Do You want to Select Again[Y/N]: ");
            ans = (char) System.in.read();

        } while (ans == 'Y' || ans == 'y');
    }
}
