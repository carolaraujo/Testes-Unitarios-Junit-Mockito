package TestesUnitarios;


public class PilhaMain {

	public static void main(String[] args) {
		PilhaTest teste = new PilhaTest();
		boolean resultado;
		
		resultado = teste.testeNaoAdicionaLivroAlemDoLimite();
		System.out.println("testeNaoAdicionaLivroAlemDoLimite: " + resultado);
		
		resultado = teste.testeRetiraUltimoLivro();
		System.out.println("testeRetiraUltimoLivro: " + resultado);
		
		resultado = teste.testeNaoAdiocionaLivroForaPadraoNome();
		System.out.println("testeNaoAdiocionaLivroForaPadraoNome: " + resultado);
	}
	
	
	
}
