package payroll;
import java.util.Scanner;

public class payrollassign {

	
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("ENTER THE EMPLOYEE NO TO GENERATE PAYSLIP: ");
	        int employeeNumber = scanner.nextInt();

	        
	        scanner.nextLine();

	        
	        System.out.println("\n\t\t\tSHREE KRISHNA CHEMISTS AND DRUGGIST  ");
	        System.out.println("\t\t\t\t\tSALARY MONTH 9 2013");

	        System.out.print("EMP.NO.: "+employeeNumber);

	        System.out.print("\t\tEMP. NAME: ");
	        String empName = scanner.nextLine();

	        System.out.print("DESIGNATION: ");
	        String designation = scanner.nextLine();

	        System.out.print("DAYS WORKED: ");
	        int daysWorked = scanner.nextInt();

	        System.out.print("PAY RATE: ");
	        double payRate = scanner.nextDouble();

	        // Consume the newline character
	        scanner.nextLine();

	        System.out.print("GEN.DATE: ");
	        String genDate = scanner.nextLine();

	       
	        double basicPay = daysWorked * payRate;
	        double pf = basicPay / 10;
	        double profTax = basicPay * 0.20;
	        double grossEarnings = basicPay;
	        double totalDeductions = pf + profTax;
	        double netPay = grossEarnings - totalDeductions;

	        
	        System.out.println("\nEARNINGS");
	        System.out.println("AMOUNT (RS.)\t\t\t\tDEDUCTIONS");
	        System.out.println("BASIC PAY: " + basicPay + "\t\t\tP.F.: " + pf);
	        System.out.println("GROSS EARNINGS: " + grossEarnings + "\tPROF. TAX: " + profTax);
	        System.out.println("NET PAY: " + netPay+"\t\t\tTOTAL DEDUCT.: " + totalDeductions);

	       
	        scanner.close();
	    }
	}