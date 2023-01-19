package questions.thursday02;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Decimal Number to be converted: ");
		int deci = sc.nextInt();
		convert(deci);
		
	}
	
	public static void convert(int d) {
		int bin[]=new int[20];
		int index=0;
		while(d!=0) {
			bin[index++] = d%2;
			d = d/2;
		}
			for(int i=index-1;i>=0;i--) {
				System.out.print(bin[i]);
			}
	}
}
