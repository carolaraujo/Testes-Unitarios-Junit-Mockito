
public class RetanguloMain {

	public static void main(String[] args) {
		
		RetanguloTest teste = new RetanguloTest();
		boolean resultado;
		
		resultado = teste.testCalcularArea();
		System.out.println("testCalcularArea: " + resultado);
		
		resultado = teste.testeCalcularPerimetro();
		System.out.println("testeCalcularPerimetro: " + resultado);
	}
}
