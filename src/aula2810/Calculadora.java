package aula2810;
import java.util.Scanner;
public class Calculadora {

	public Calculadora() {
		
		int num1, num2,total;
		
		System.out.println("Introduza o primeiro numero:");
		num1=(new Scanner(System.in)).nextInt();

		System.out.println("Introduza o segundo numero:");
		num2=(new Scanner(System.in)).nextInt();
		
		total=num1+num2;
		System.out.println(total);
	}

}
