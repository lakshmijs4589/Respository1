package assignment5;

public class PalindromeChecker {

	    String str; 

	    // Constructor to initialize the string
	    public PalindromeChecker(String str) {
	        this.str = str;
	    }

	    // Method to check if the string is a palindrome
	    
	    public boolean isPalindrome()
	    {
	        String original = this.str;
	        String reversed = "";
	        
	        for (int i = original.length() - 1; i >= 0; i--) 
	        {
	            reversed += original.charAt(i);
	        }

	        return original.equalsIgnoreCase(reversed);   // Check if original and reversed strings are same
	    }

	    public void displayResult() {
	        if (isPalindrome()) {
	            System.out.println("\"" + this.str + "\" is a Palindrome");
	        } else {
	            System.out.println("\"" + this.str + "\" is not a Palindrome");
	        }
	    }

	    public static void main(String[] args) 
	    {
	        PalindromeChecker obj1 = new PalindromeChecker("Java");
	        obj1.displayResult();

	        PalindromeChecker obj2 = new PalindromeChecker("Malayalam");
	        obj2.displayResult();
	    }
	}