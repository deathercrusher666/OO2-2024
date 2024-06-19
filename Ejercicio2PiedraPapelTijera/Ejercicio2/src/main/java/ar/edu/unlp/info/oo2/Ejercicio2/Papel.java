package ar.edu.unlp.info.oo2.Ejercicio2;

public class Papel extends Jugada {

	public String recibirJugada(Jugada recibido) {
		return recibido.jugarContraPapel();
	}
	
	public String jugarContraPiedra() {
		return "Gana Papel";
	}
	
	public String jugarContraPapel() {
		return "Empate";
	}
	
	public String jugarContraTijera() {
		return "Gana Tijera";
	}
	
	public String jugarContraLagarto() {
		return "Gana Lagarto";
	}
	public String jugarContraSpock() {
		return "Gana Papel";
	}
}
