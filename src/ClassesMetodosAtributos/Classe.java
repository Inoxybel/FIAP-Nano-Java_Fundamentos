package ClassesMetodosAtributos;

public class Classe {
	
	public void Classe() {
		System.out.println("Construtor padrão acionado!");
	}
	
	public void Conta(String parametro) {
		System.out.println("Construtor com parâmetro: " + parametro);
	}

	int atributoNumerico = 10;
	char atributoTexto = 'a';
	boolean atributoLogico = true;
	
	public void MetodoSemRetornoESemParametro() {
		System.out.println("Método sem retorno e sem parâmetro acionado!");
	}
	
	public void MetodoSemRetornoEComParametro(int parametro) {
		System.out.println("Método sem retorno que com parâmetro do tipo inteiro com valor " + parametro);
	}
	
	public int MetodoComRetornoInteiroSemParametro() {
		return 1;
	}
	
	public int MetodoComRetornoInteiroEParametros(int valor1, int valor2) {
		return valor1 + valor2;
	}
	
}
