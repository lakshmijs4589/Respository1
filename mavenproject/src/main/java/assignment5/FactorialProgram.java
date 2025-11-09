package assignment5;

	public class FactorialProgram {
	    int number;        
	    long factorial;    

	    // Method to calculate factorial
	    public void calculateFactorial(int num) {
	        this.number = num; 
	        this.factorial = 1;

	        for (int i = 1; i <= num; i++) {
	            this.factorial *= i;
	        }
	    }

	    // Method to print the result
	    public void printResult() {
	        System.out.println("Factorial of " + this.number + " is " + this.factorial);
	    }

	    public static void main(String[] args) {
	        FactorialProgram obj = new FactorialProgram();
	        obj.calculateFactorial(5); 
	        obj.printResult();
	    }
	}
