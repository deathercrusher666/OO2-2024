package ar.edu.unlp.info.oo2.Ejercicio2;

public class Tijera extends Jugada{

	public String recibirJugada(Jugada recibido) {
		return recibido.jugarContraTijera();
	}
	
	public String jugarContraPiedra() {
		return "Gana Piedra";
	}
	
	public String jugarContraPapel() {
		return "Gana Tijera";
	}
	
	public String jugarContraTijera() {
		return "Empate";
	}

	public String jugarContraLagarto() {
		return "Gana Tijera";
	}
	public String jugarContraSpock() {
		return "Gana Spock";
	}
}
