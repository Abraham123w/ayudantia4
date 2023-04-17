import java.util.ArrayList;

public class GestionJuego {
     //atributo nombreJugador para asignarlo al jugador creado
    private String nombreJugador;
    public GestionJuego() {
    }
    public void enfrentarJugador(){
        Jugador judador1=new Jugador(5000,getNombreJugador());
        //creamos jugador secundario para atacarlo
        Jugador jugador2= new Jugador(800,"killer24");
        judador1.atacarJugador(jugador2);
    }
     public void enfrentarEnemigos(){
         //creamos el objeto jugador
         Jugador judador1=new Jugador(5000,getNombreJugador());

         // creamos los objetos enmigos de tipo: golem, bruja y mago
         Golem golem1= new Golem(100,1,1);
         Bruja bruja1= new Bruja(100,2,2);
         Mago mago1=new Mago(100,3,3);
         //creamos lista de enemigos para enviarselas a jugador1 y pueda atacarlos
         ArrayList<Enemigo> listaEnemigos = new ArrayList<>();
         listaEnemigos.add(golem1);
         listaEnemigos.add(bruja1);
         listaEnemigos.add(mago1);
         judador1.setEnemigos(listaEnemigos);
         //atacamos a los enemigos
         judador1.atacarEnemigo();

     }
    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }
}