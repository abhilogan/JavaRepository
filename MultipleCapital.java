package MyPack;

import java.util.Scanner;

public class MultipleCapital {

	public static void main(String[] args) {

		String ch = null;
		
		do{
		int num;
		System.out.println("1.India\n2.Austrilia\n3.Srilinka\n4.Japan");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice between 1 to 4");
		num = sc.nextInt(); // it is accepting value and converting into integer

		switch (num) {
		case 1:
			System.out.println("\nCapital of india is Delhi!");
			break;

		case 2:
			System.out.println("\nCapital of Austrilia is Canbera!");
			break;

		case 3:
			System.out.println("\nCapital of Shrilanka is Colombo");
			break;

		case 4:
			System.out.println("\nCapital of Japan is Tokyo");
			break;

		default:
			System.out.println("Please Check The Input");
		}
		System.out.println("Do you want to continue yes/no");
		ch = sc.next();
		}
		while(ch.equals("yes")); 

	}

}
