package ClassesMetodosAtributos;

public class Classe {
	
	public void Classe() {
		System.out.println("Construtor padr�o acionado!");
	}
	
	public void Conta(String parametro) {
		System.out.println("Construtor com par�metro: " + parametro);
	}

	int atributoNumerico = 10;
	char atributoTexto = 'a';
	boolean atributoLogico = true;
	
	public void MetodoSemRetornoESemParametro() {
		System.out.println("M�todo sem retorno e sem par�metro acionado!");
	}
	
	public void MetodoSemRetornoEComParametro(int parametro) {
		System.out.println("M�todo sem retorno que com par�metro do tipo inteiro com valor " + parametro);
	}
	
	public int MetodoComRetornoInteiroSemParametro() {
		return 1;
	}
	
	public int MetodoComRetornoInteiroEParametros(int valor1, int valor2) {
		return valor1 + valor2;
	}
	
}
