package questions.thursday02;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int digit = sc.nextInt();
		
		sumDigits(digit);
		
		
		
	}
	static void sumDigits(int x) {
		int sum=0;
		while(x!=0) {
			sum = sum + (x%10);
			x=x/10;
		}
		System.out.println("The sum of digits is: "+ sum);
	}

}
