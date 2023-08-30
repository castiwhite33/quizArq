
package quizarq;
import java.util.ArrayList;
import java.util.Scanner;
public class Contactos {
    public static void main(String[] args) {
    
        ArrayList<Contacto> contactos = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
           
            System.out.println("1. Agregar contacto");
            System.out.println("2. Buscar número por nombre");
            System.out.println("3. Mostrar lista de contactos");
            System.out.println("4. Salir");
           
            int opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    
                    System.out.println("Introduzca el nombre del contacto:");
                    String nombre = scanner.next();
                    System.out.println("Introduzca el número de teléfono del contacto:");
                    int numero = scanner.nextInt();
                    contactos.add(new Contacto(nombre, numero));
                    break;
                case 2:
                   
                           
                    System.out.println("Introduzca el nombre del contacto:");
                    String nombre2 = scanner.next();
                    for (Contacto contacto : contactos) {
                        if (contacto.getNombre().equals(nombre2)) {
                            System.out.println("El número de teléfono de " + nombre2 + " es " + contacto.getNumero());
                            break;
                        }
                    }
                    break;
                case 3:
                    
                    for (Contacto contacto : contactos) {
                        System.out.println(contacto.getNombre() + " - " + contacto.getNumero());
                    }
                    break;
                case 4:
                    
                    System.exit(0);
            }
        }
    }
}
