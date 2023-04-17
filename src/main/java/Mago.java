public class Mago extends Enemigo {
	private int magia;
    private String tipo;
	public int getMagia() {
		return this.magia;
	}

	public void setMagia(int aMagia) {
		this.magia = aMagia;
	}

	public Mago(int aFuerza, int aVelocidad, int aMagia) {
		super(aFuerza,aVelocidad);
		this.magia=aMagia;

		throw new UnsupportedOperationException();
	}

	public String getTipo() {
		tipo="mago";
		return tipo;
	}


}