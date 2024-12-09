
public class main_baraja {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();

        System.out.println("Mostrar las cartas disponibles (" + baraja.cartasDisponibles()+")");

        System.out.println("Sacar una carta: " + baraja.siguienteCarta());

        System.out.println("Sacar 8 cartas mas:");
        
        for (Baraja.Carta carta : baraja.darCartas(8)) {
            System.out.println(carta);
        }
        
        System.out.println("Volver a mostrar las cartas disponibles (" + baraja.cartasDisponibles()+")");

        baraja.cartasMonton();

        System.out.println("Barajando la baraja...");
        baraja.barajar();

        System.out.println("Sacar 5 cartas:");
        
        for (Baraja.Carta carta : baraja.darCartas(5)) {
            System.out.println(carta);
        }

        
        System.out.println("Mostrar las cartas sacadas después de barajar.");
        baraja.cartasMonton();
    }
}
