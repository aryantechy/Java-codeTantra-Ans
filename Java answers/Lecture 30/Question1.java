Java provides support for printf style formatting of strings. Printf style formatting contains a format string and a number of different data type parameters. The format string contains plain text as well as format specifiers, which are special characters that format the parameters. The function produces an output string with parameters applied as per the format specifiers.
formatted the parameter values as per the format specifiers and produced the output string.

package q11185;
public class StringFormatting {
	public static void main(String[] args) {
		int iVar = 432000;
		System.out.printf("Integer variable = %d%n", iVar);
		double dVar = 3.14159;
		System.out.printf("Double variable = %f%n", dVar);
		String str = "Demo";
		System.out.printf("String variable = %s%n", str);
	}
}
