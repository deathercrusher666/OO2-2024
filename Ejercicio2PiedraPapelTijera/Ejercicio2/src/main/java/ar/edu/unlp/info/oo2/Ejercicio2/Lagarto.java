package ar.edu.unlp.info.oo2.Ejercicio2;

public class Lagarto {

	public String recibirJugada(Jugada recibido) {
		return recibido.jugarContraPiedra();
	}
	
	public String jugarContraPiedra() {
		return "Gana Piedra";
	}
	
	public String jugarContraPapel() {
		return "Gana Lagarto";
	}
	
	public String jugarContraTijera() {
		return "Gana Tijera";
	}
	
	public String jugarContraLagarto() {
		return "Empate";
	}
	public String jugarContraSpock() {
		return "Gana Lagarto";
	}
}
	

