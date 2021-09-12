package MyPack;

import java.util.Scanner;

//accept country number and print the capital of the country
public class Capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}

}
