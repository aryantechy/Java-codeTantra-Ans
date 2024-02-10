Write a class NumberPalindrome with a public method isNumberPalindrome that takes one parameter number of type int. Write a code to check whether the given number is palindrome or not.

For example
Cmd Args : 333
333 is a palindrome


package q10894;

public class NumberPalindrome {
	
	public void isNumberPalindrome(int num) {
		
		//Write your code here
		int  reversedNum = 0, remainder;
		int originalNum = num;
		while (num != 0) {
			
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /= 10;
			
		}
		if (originalNum == reversedNum) {
			
			System.out.println(originalNum + " is a palindrome");
			
		}
		
		else {
			
			System.out.println(originalNum + " is not a palindrome");
			
		}
	}
}