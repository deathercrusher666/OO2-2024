package ar.edu.unlp.info.oo2.Ejercicio2;

public class Spock {
	
	public String recibirJugada(Jugada recibido) {
		return recibido.jugarContraPiedra();
	}
	
	public String jugarContraPiedra() {
		return "Gana Spock";
	}
	
	public String jugarContraPapel() {
		return "Gana Papel";
	}
	
	public String jugarContraTijera() {
		return "Gana Spock";
	}
	
	public String jugarContraLagarto() {
		return "Gana Lagarto";
	}
	public String jugarContraSpock() {
		return "Empate";
	}
}


