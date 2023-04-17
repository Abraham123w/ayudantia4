public abstract class Enemigo {
	private int fuerza;
	private int velocidad;

	public int getFuerza() {
		return this.fuerza;
	}

	public void setFuerza(int aFuerza) {
		this.fuerza = aFuerza;
	}

	public int getVelocidad() {
		return this.velocidad;
	}

	public void setVelocidad(int aVelocidad) {
		this.velocidad = aVelocidad;
	}

	public Enemigo(int aFuerza, int aVelocidad) {
		this.fuerza=aFuerza;
		this.velocidad=aVelocidad;
	}

	public abstract String getTipo();
}