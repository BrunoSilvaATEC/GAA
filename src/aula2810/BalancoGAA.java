package aula2810;
import java.util.Scanner;

public class BalancoGAA {

	public BalancoGAA() {
		int balanco = calcularBalanco();
		
		System.out.println("O balanco do ano de actividade � de: " + balanco);
	}
	
	public int receitas() {
		System.out.println("Qual foi o total angariado com as quotas?");
		int quotas = (new Scanner(System.in)).nextInt();

		System.out.println("Qual foi o total angariado com as festas em honra � Senhora da Arrudinha?");
		int festas = (new Scanner(System.in)).nextInt();
		
		int totalReceitas = quotas + festas;
		
		return totalReceitas;	
	}
	
	public int despesas() {
		System.out.println("Qual foi o total despendido com as contas da electricidade?");
		int luz= (new Scanner(System.in)).nextInt();

		System.out.println("Qual foi o total despendido com as contas da �gua?");
		int agua = (new Scanner(System.in)).nextInt();
		
		int totalDespesas = luz + agua;
		
		return totalDespesas;			
	}
	
	public int calcularBalanco() {
		int balanco = receitas() - despesas();
		
		return balanco;
	}

}