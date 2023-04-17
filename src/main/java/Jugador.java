import java.util.ArrayList;

public class Jugador {
    private int vida;
    private String nombre;
    public ArrayList<Enemigo> enemigos = new ArrayList<Enemigo>();
    public ArrayList<Jugador> jugadorAtaque = new ArrayList<Jugador>();

    public int getVida() {
        return this.vida;
    }

    public void setVida(int aVida) {

        this.vida = aVida;
    }


    public void atacarEnemigo() {
        int quitarVida=0;
        for (int i = 0; i < this.enemigos.size(); i++) {
             quitarVida = quitarVida+enemigos.get(i).getFuerza();

        }
       setVida(getVida()-quitarVida);
    }

    public void recibirAtaqueEnemigos() {
        int quitarVida=0;

        for (int i = 0; i < this.enemigos.size(); i++) {
            quitarVida = quitarVida+enemigos.get(i).getFuerza()*enemigos.get(i).getVelocidad();



        }
        setVida(getVida()-quitarVida);

    }

    public void atacarJugador(Jugador aJugador) {
        int quitarVida=0;
        quitarVida=aJugador.getVida();

        setVida(getVida()-quitarVida);

    }

    public void recibiraAtaqueDeJugador(Jugador aJugador) {
        int quitarVida=0;
        quitarVida=aJugador.getVida()+50;

        setVida(getVida()-quitarVida);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String aNombre) {
        this.nombre = aNombre;
    }



    public ArrayList<Enemigo> obtenerListaDeEnemigos() {
        return enemigos;
    }

    public ArrayList<Enemigo> getEnemigos() {
        return enemigos;
    }

    public void setEnemigos(ArrayList<Enemigo> enemigos) {
        this.enemigos = enemigos;
    }

    public ArrayList<Jugador> getJugadorAtaque() {
        return jugadorAtaque;
    }

    public void setJugadorAtaque(ArrayList<Jugador> jugadorAtaque) {
        this.jugadorAtaque = jugadorAtaque;
    }
    public Jugador(int aVida, String aNombre) {
        throw new UnsupportedOperationException();
    }
}