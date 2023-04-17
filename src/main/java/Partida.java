import java.util.ArrayList;

public class Partida {
	private int id;
	public ArrayList<Enemigo> enemigos = new ArrayList<Enemigo>();
	public ArrayList<Jugador> jugadoresEnemigos = new ArrayList<Jugador>();
	public Jugador jugadorPrinciipal;

	public int getId() {
		return this.id;
	}

	public void setId(int aId) {
		this.id = aId;
	}

	public Partida(int aId) {
		throw new UnsupportedOperationException();
	}


}