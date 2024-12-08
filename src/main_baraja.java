import java.util.List;

public class main_baraja {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();

        System.out.println("Mostrar las cartas disponibles(" + baraja.cartasDisponibles()+")");

        System.out.println("Sacar una carta: " + baraja.siguienteCarta());

        System.out.println("Sacar 8 cartas mas:");
        List<Carta> cartasRepartidas = baraja.darCartas(8);
        if (cartasRepartidas != null) {
            for (Carta carta : cartasRepartidas) {
                System.out.println(carta);
            }
        }

        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());

        System.out.println("Cartas en el montón:");
        baraja.cartasMonton();

        System.out.println("Barajando la baraja...");
        baraja.barajar();

        System.out.println("Saco 5 cartas después de barajar:");
        cartasRepartidas = baraja.darCartas(5);
        if (cartasRepartidas != null) {
            for (Carta carta : cartasRepartidas) {
                System.out.println(carta);
            }
        }

        System.out.println("Cartas en el montón después de barajar:");
        baraja.cartasMonton();
    }
}
