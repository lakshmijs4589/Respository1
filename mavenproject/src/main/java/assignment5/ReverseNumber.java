package assignment5;

	public class ReverseNumber {
		int num;        
	    int reverse;    

	    // Constructor for calculation of reverse
	    public ReverseNumber(int num) {
	        this.num = num;
	        this.reverse = 0;
	        int temp = num;

	        while (temp != 0) {
	            int digit = temp % 10;
	            this.reverse = this.reverse * 10 + digit;
	            temp /= 10;
	        }
	    }

	    // Method to display the reversed number
	    public void displayReverse() {
	        System.out.println("Reversed number is: " + this.reverse);
	    }

	    public static void main(String[] args) {
	        ReverseNumber obj = new ReverseNumber(12345);
	       	 obj.displayReverse();
	    }
	}