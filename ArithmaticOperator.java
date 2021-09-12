package MyPack;

import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		String str;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No1");
		a = sc.nextInt();

		System.out.println("Enter No2");
		b = sc.nextInt();

		System.out.println("+.Addition\n-.Subtraction\n*.Multiplication\nDivision");
		System.out.println("Enter your Operator +,-,*,/");
		str = sc.next();

		ch = str.charAt(0);

		switch (ch) {
		case '+':
			c = a + b;
			System.out.println("Addition is " + c);
			break;

		case '-':
			c = a - b;
			System.out.println("Subtraction is " + c);
			break;

		case '*':
			c = a * b;
			System.out.println("Multiplication is " + c);
			break;

		case '/':
			c = a / b;
			System.out.println("Division is " + c);
			break;

		default:
			System.out.println("Check your operator");
			break;
		}

	}

}
