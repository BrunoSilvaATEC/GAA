
public class exerciciobalanco {
	
	int totalReceitas =0;
	int totaldespesas =0;
	public exerciciobalanco() {
		// TODO Auto-generated constructor stub
System.out.println("Ola Turma!");
	
		//CALCULAR RECEITAS
		calcularReceitas ();
		
		
		// CALCULA DESPESAS
		calcularDespesas  ();
		
		
		//BALANÇO
		int balanco = 0 ;
		
		
	
		balanco = totalReceitas - totaldespesas;
		
		
		System.out.println ( " Todas de receitas " +  totalReceitas + "€ "+" Todas de despesas " +  totaldespesas + "€ " +" balanco " +  balanco + "€ ");
		
		
	}

	public void calcularReceitas ()
	{
	// CALCULA RECEITAS
	int quotas = 300,
	recBaile = 200,
	recBar   = 250;
	
	 totalReceitas = quotas + recBaile+ recBar;
	}
	
	public void calcularDespesas ()
	{
		// CALCULA DESPESAS
		int agua			=80;
		int luz 			=60;
		int telefone	=70;

		totaldespesas= agua + luz + telefone;
	}
	
	
	
	
	
	
}
