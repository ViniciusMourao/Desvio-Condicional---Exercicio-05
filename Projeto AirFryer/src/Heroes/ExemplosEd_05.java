package Heroes;

import java.util.Scanner;

public class ExemplosEd_05 {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		
		double n1, n2, n3, maior, menor;
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		n3 = input.nextDouble();
	
		
		if (n1 > n2 && n1 > n3) {
			maior = n1;
		}else if (n2 > n1 && n2 > n3) {
			maior = n2;
		}else {
			maior = n3;
		}
		if (n1 < n2 && n1 < n3) {
			menor = n1;
		}else if (n2 < n1 && n2 < n3) {
			menor = n2;
		}else {
			menor = n3;
		}
		
		System.out.println("O menor número é" +menor +"\n O maior número é" +maior);
		input.close();
		
		
		
		
	}
}
