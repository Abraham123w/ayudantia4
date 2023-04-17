public class Bruja extends Enemigo {
	private int hechiso;
    private String tipo;
	public int getHechiso() {
		return this.hechiso;
	}

	public void setHechiso(int aHechiso) {
		this.hechiso = aHechiso;
	}



	public String getTipo() {
		tipo="Bruja";
		return tipo;
	}
	public Bruja(int aFuerza, int aCelocidad, int aHechiso) {
		super(aFuerza,aCelocidad);
		this.hechiso=aHechiso;
	}

}