public class Golem extends Enemigo {
	private int escudo;
	private String tipo;

	public int getEscudo() {
		return this.escudo;
	}

	public void setEscudo(int aEscudo) {
		this.escudo = aEscudo;
	}

	public Golem(int aFuerza, int aVelocidad, int aEscudo) {
		super(aFuerza,aVelocidad);
		this.escudo=aEscudo;

	}

	public String getTipo() {
		tipo="Golem";
		return tipo;
	}


}