package questions.thursday02;

import java.util.Scanner;

public class GreaterElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the size of the Array: ");
		n = sc.nextInt();
		
		System.out.println("Enter the Array");
		
		int [] arr = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("The Array is: ");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		greater(arr,n);

	}
	static void greater(int a[],int n) {
		int x =0;
		int ind=0;
		for(int i=0;i<n;i++) {
			if(x<a[i]) {
				x = a[i];
			}
		}
		for( int i=0;i<n;i++) {
			ind++;
			if(x==a[i]) {
				break;
			}
		}
			
		System.out.println();
		System.out.println("The greatest Number is: "+x);
		System.out.println("The Index of the Number is: "+ind);
	}

}
