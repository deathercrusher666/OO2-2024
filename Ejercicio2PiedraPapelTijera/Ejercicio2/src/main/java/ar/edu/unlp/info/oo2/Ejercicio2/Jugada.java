package ar.edu.unlp.info.oo2.Ejercicio2;

public abstract class Jugada {
	
	public String jugar(){
		return "sarasa";
		
	}

	
	abstract public String recibirJugada(Jugada recibido);
	
	abstract public String jugarContraPapel();
	abstract public String jugarContraPiedra();
	abstract public String jugarContraTijera();
}
