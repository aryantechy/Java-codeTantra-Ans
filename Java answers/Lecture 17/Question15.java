Write a class FibonacciSeries with a main method. The method receives one command line argument. Write a program to display fibonacci series i.e. 0 1 1 2 3 5 8 13 21.....

For example:
Cmd Args : 80
0 1 1 2 3 5 8 13 21 34 55


package q10896;
class FibonacciSeries{

public static void main(String[] args){
		int n=Integer.parseInt(args[0]);
		int a=0,b=1;
		int k=0;
		System.out.println(a);
	while(b<=n){
		System.out.println(" "+b);
	c=a+b;
	a=b;
	b=c;

	}
	}
}
	
