
public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ola Turma!");
		
		int quotas = 300,
			recBaile = 200,
			recBar   = 250;
			
		int totalReceitas = quotas + recBaile+ recBar;
	
		int agua			=80;
		int luz 			=60;
		int telefone	=70;
		int totaldespesas = 0 ;
		int balanco = 0 ;
		
		
		totaldespesas= agua + luz + telefone;
		balanco = totalReceitas - totaldespesas;
		
		
		System.out.println ( " Todas de receitas " +  totalReceitas + "€ "+" Todas de despesas " +  totaldespesas + "€ " +" balanco " +  balanco + "€ ");
		
		
	}

}
