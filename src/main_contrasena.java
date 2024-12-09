
import java.util.Scanner;

public class main_contrasena {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("dame el numero de contraseñas que quieras: ");
            int n=scan.nextInt();
            contrasena[] array=new contrasena[n];
            
            for (int i = 0; i < n; i++) {
                System.out.print("Introduce longitud para la contraseña " + (i + 1) + ": ");
                array[i] =new contrasena(scan.nextInt());
                System.out.println(array[i].datos());

            }
        }
        
    }
}
