package aplication;

public class Configuracao {
		
	private static Configuracao instancia;
	
	private String ip;
	private int porta;
		
	private Configuracao() {		
	}
	
	public static synchronized Configuracao getInstace() {
		if (instancia == null) {
			instancia = new Configuracao();
		}
		return instancia;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPorta() {
		return porta;
	}

	public void setPorta(int porta) {
		this.porta = porta;
	}
	
	public boolean conectar() {
		return false;
	}	
}
