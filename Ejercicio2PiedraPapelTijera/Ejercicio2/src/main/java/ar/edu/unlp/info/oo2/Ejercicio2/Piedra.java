package ar.edu.unlp.info.oo2.Ejercicio2;

public class Piedra extends Jugada{

	public String recibirJugada(Jugada recibido) {
		return recibido.jugarContraPiedra();
	}
	
	public String jugarContraPiedra() {
		return "Empate";
	}
	
	public String jugarContraPapel() {
		return "Gana Papel";
	}
	
	public String jugarContraTijera() {
		return "Gana Piedra";
	}
	
	public String jugarContraLagarto() {
		return "Gana Piedra";
	}
	public String jugarContraSpock() {
		return "Gana Spock";
	}
}
