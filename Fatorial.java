public class Fatorial	{
	// versao iterativa do calculo do fatorial, incluindo o Teste para n==0
	public int calcularFatorial(int n) throws IllegalArgumentException	{
		// Verifica se eh menor que zero		
		if (n < 0)	{
			throw new IllegalArgumentException("Nao existe fatorial para numeros negativos");
		}	

		int resultado = 1;

		// Verifica se eh diferente que zero
		if (n != 0)	{
			for (int i = 2; i <= n; i++)	{
				resultado *= i;
			}
		}

		return resultado;

	}
	
}