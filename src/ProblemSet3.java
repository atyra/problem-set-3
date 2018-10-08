/**
 * INSTRUCTIONS.
 * 
 * Problem Set 3 will be more extensive than the first two. You've been warned. Practice makes perfect,
 * and we'll get a lot of practice with conditional and iterative control structures.
 * 
 * A few new concepts are being introduced with this assignment. Last time, we saw methods (other than
 * the @main method) for the first time. Now, we're seeing parameters, which are the variables inside
 * the parentheses in our methods. We'll cover these in more detail later. For now, you just need to
 * understand the basics.
 * 
 * A parameter is data that is provided to the method. It helps the method do its job. It's passed in
 * through the parentheses, and you can reference these variables by name as if they're your own.
 */

public class ProblemSet3 {
	
	/**
	 * Make sure you're testing your code by calling your methods from the main method!
	 */
	
	public static void main(String[] args) {
		ProblemSet3 ps3 = new ProblemSet3();
		
        System.out.println("dateFashion: (5, 10), (5, 5), and (2, 8)");
		ps3.dateFashion(5, 10);
		ps3.dateFashion(5,  5);
		ps3.dateFashion(2,  8);
		
		System.out.println("fizzString: (\"fig\"), (\"dib\"), (\"fib\"), and (\"abc\")");
		ps3.fizzString("fizz");
		ps3.fizzString("dib");
		ps3.fizzString("fib");
		ps3.fizzString("abc");
		
		System.out.println("squirrelPlay: (70, false), (95, false), and (95, true)");
		ps3.squirrelPlay(70, false);
		ps3.squirrelPlay(95, false);
		ps3.squirrelPlay(95, true);
		
		System.out.println("fizzStringAgain: (2), (9), (10), and (15)");
		ps3.fizzStringAgain(2);
		ps3.fizzStringAgain(9);
		ps3.fizzStringAgain(10);
		ps3.fizzStringAgain(15);
		
		System.out.println("makeBricks: (3, 1, 8), (3, 1, 9), and (3, 2, 10)");
		ps3.makeBricks(3, 1, 8);
		ps3.makeBricks(3, 1, 9);
		ps3.makeBricks(3, 2, 10);
		
		System.out.println("loneSum: (1, 2, 3), (3, 2, 3), and (3, 3, 3)");
		ps3.loneSum(1, 2, 3);
		ps3.loneSum(3, 2, 3);
		ps3.loneSum(3, 3, 3);
		
		System.out.println("luckySum: (1, 2, 3), (1, 2, 13), and (1, 13, 2)");
		ps3.luckySum(1, 2, 3);
		ps3.luckySum(1, 2, 13);
		ps3.luckySum(1, 13, 3);
		
		System.out.println("factorialWithFor: (3), (4), and (5)");
		ps3.factorialWithFor(3);
		ps3.factorialWithFor(4);
		ps3.factorialWithFor(5);
		
		System.out.println("factorialWithWhile: (3), (4), and (5)");
		ps3.factorialWithWhile(3);
		ps3.factorialWithWhile(4);
		ps3.factorialWithWhile(5);
		
		System.out.println("isPrime: (1), (2), (17), and (144)");
		ps3.isPrime(1);
		ps3.isPrime(2);
		ps3.isPrime(17);
		ps3.isPrime(144);
	}
		
	public void dateFashion(int you, int date) {
		if ((you >= 8 || date >= 8) && (date > 2 && you > 2)) {
			System.out.println("YES");
		}
		else if (you <= 2 || date <= 2) {
			System.out.println("NO");
		}
		else {
			System.out.println("MAYBE");
		}
	}

	public void fizzString(String str) {
	    if ((str.charAt(0) == 'f') && (str.charAt(str.length() - 1) == 'b')) {
	    	System.out.println("FIZZBUZZ");
	    }
		else if (str.charAt(0) == 'f') {
			System.out.println("FIZZ");
		}
		else if (str.charAt(str.length() - 1) == 'b') {
			System.out.println("BUZZ");
		}
		else {
			System.out.println(str);
		}
	}
		
	public void squirrelPlay(int temp, boolean isSummer) {
		if ((90 >= temp) && (temp >= 60) && (isSummer == false)) {
			System.out.println("YES");
		}
		else if ((100 >= temp) && (temp >= 60) && (isSummer == true)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
	
	public void fizzStringAgain(int n) {
		if ((n % 3 == 0) && (n % 5 == 0)) {
			System.out.println("FIZZBUZZ!");
		}
		else if ((n % 3 == 0) && !(n % 5 == 0)) {
			System.out.println("FIZZ!");
		}
		else if (!(n % 3 == 0) && (n % 5 == 0)) {
			System.out.println("BUZZ!");
		}
		else {
			String converted = Integer.toString(n);
			System.out.println(converted + "!");
		}
	}
	
	public void makeBricks(int small, int big, int goal) {
		int bigFive = big * 5;
		if (bigFive + small < goal) {
			System.out.println("NO");
		}
		else if (bigFive == 0 && small < goal) {
			System.out.println("NO");
		}
		else if (bigFive > goal) {
			for (int test = bigFive; test == 0; test = test - 5) {
				if (test + small == goal) {
					System.out.println("YES");
				}
				else if (test + small < goal){
					System.out.println("NO");
				}
			}
		}
		else if (goal % bigFive > small) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
	}
	
	public void loneSum(int a, int b, int c) {
		if ((a != b) && (b != c) && (a != c)) {
			int sum = a + b + c;
			System.out.println(sum + ".");
		}
		else if ((a == b) && (a != c)) {
			int sum = c;
			System.out.println(sum + ".");
		}
		else if ((a == c) && (a != b)) {
			int sum = b;
			System.out.println(sum + ".");
		}
		else if ((b == c) && (a != b)) {
			int sum = a;
			System.out.println(sum + ".");
		}
		else if ((a == b) && (b == c)) {
			System.out.println("0.");
		}
	}
	
	public void luckySum(int a, int b, int c) {
		if (a == 13) {
		    System.out.println("0.");
		}
		else if ((b == 13) && (a != 13)) {
		    System.out.println(a + ".");
		}
		else if ((c == 13) && (a != 13) && (b != 13)) {
		    System.out.println(a + b + ".");
		}
		else {
		    System.out.println(a + b + c + ".");
		}
	}
	
	public void factorialWithFor(int n) {
		int factorial = 1;
		for (int x = n; x > 0; x--) {
		    factorial = factorial * x;
		    if (x == 1) {
		        System.out.print(n);
		        System.out.print("! = ");
		        System.out.println(factorial);
		    }
		}
	}
	
	public void factorialWithWhile(int n) {
		int factorial = 1;
		int n2 = n;
		while (n2 > 0) {
		    factorial = factorial * n2;
		    if (n2 == 1) {
		        System.out.print(n);
		        System.out.print("! = ");
		        System.out.println(factorial);
		    }
		    n2--;
		}
	}
	
	public void isPrime(int n) {
		if (n > 1) {
			if (n % 2 != 0) {
				if((n == 3) || (n == 5) || (n == 7)) {
					System.out.println("PRIME");
				}
				else if ((n % 3 != 0) && (n % 5 != 0) && (n % 7 != 0)) {
					System.out.println("PRIME");
				}
				else {
					System.out.println("NOT PRIME");
				}
			}
			else if (n == 2) {
				System.out.println("PRIME");
			}
			else {
				System.out.println("NOT PRIME");
			}
		}
		else {
			System.out.println("NOT PRIME");
		}
	}
}

