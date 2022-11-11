package aplication;

public class Program {
	
	public static void main(String[] args) {
		
		Configuracao configuracao1 = Configuracao.getInstace();
		Configuracao configuracao2 = Configuracao.getInstace();
		
		System.out.println(configuracao1);
		System.out.println(configuracao2);
	}
}
