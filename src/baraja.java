import java.util.ArrayList;
import java.util.Random;



class Baraja {
    private final ArrayList<Carta> cartas;
    private final ArrayList<Carta> cartasMonton;

    static class Carta {
        private final String palo;
        private final int n;

        public Carta(String palo, int n) {
            this.palo = palo;
            this.n = n;
        }

        public String toString() {
            return n + " de " + palo;
        }
    }

    public Baraja() {
        this.cartas = new ArrayList<>();
        this.cartasMonton = new ArrayList<>();
        String[] palos = {"OROS", "COPAS", "ESPADAS", "BASTOS"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    cartas.add(new Carta(palo, numero));
                }
            }
        }
    }

    public void barajar() {

        for (int i = cartas.size() - 1; i > 0; i--) {
           
            int j = new Random().nextInt(cartas.size());
            Carta aux = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, aux);
        
        }
    }

    public Carta siguienteCarta() {
        if (cartas.isEmpty()) {
            System.out.println("No quedan cartas en la baraja.");
            return null;
        }
        Carta carta = cartas.removeFirst();
        cartasMonton.add(carta);
        return carta;
    }

    public int cartasDisponibles() {
        return cartas.size();
    }

    public ArrayList<Carta> darCartas(int n) {
        if (n > cartas.size()) {
            System.out.println("No hay suficientes cartas para repartir.");
            return null;
        }
        ArrayList<Carta> aux = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            aux.add(siguienteCarta());
        }
        return aux;
    }

    public void cartasMonton() {
        if (cartasMonton.isEmpty()) {
            System.out.println("No ha salido ninguna carta todavía.");
        } else {
            System.out.println("Cartas en el montón: ");
            for (Carta carta : cartasMonton) {
                System.out.println(carta);
            }
        }
    }

    public void mostrarBaraja() {
        if (cartas.isEmpty()) {
            System.out.println("No quedan cartas en la baraja.");
        } else {
            for (Carta carta : cartas) {
                System.out.println(carta);
            }
        }
    }

}