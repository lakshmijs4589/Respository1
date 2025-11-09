package assignment6;

public class SalarySlip extends SalaryCalculations {
    double totalSalary;

    public void calculateTotalSalary() {
        totalSalary = basicPay + hra - pf - deduction + bonus;
    }

    public void displaySlip() {
        System.out.println("\n----- Salary Slip -----");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA (5%): " + hra);
        System.out.println("PF (20%): " + pf);
        System.out.println("Deduction: " + deduction);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + totalSalary);
    }

    public static void main(String[] args) {
        SalarySlip obj = new SalarySlip();
         obj.getDetails();            
         obj.calculateComponents();   
         obj.calculateTotalSalary();  
         obj.displaySlip();           
    }
}