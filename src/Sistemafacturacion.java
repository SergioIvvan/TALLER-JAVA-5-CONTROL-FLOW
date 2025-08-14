import java.util.Scanner;

public class Sistemafacturacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el total de la compra: ");
        double Compratotal = scanner.nextDouble();

        System.out.println("Ingrese la cantidad de productos: ");
        int Productoscantidad = scanner.nextInt();

        scanner.nextLine();

        System.out.println("¿Tiene membresia con nuestra tienda?: ");
        String tipoCliente = scanner.nextLine().toLowerCase();

        double totalFinal = Compratotal;

        switch (tipoCliente){
            case "si":
                totalFinal = totalFinal * 0.90;

                break;

            case "no":

                break;
            default:
                System.out.println("Ingrese un valor valido");

                break;
        }

        if (Productoscantidad >= 10){
            totalFinal = totalFinal * 0.95;

        }
        System.out.println("El total a pagar es: "+ totalFinal);

        scanner.close();
    }
}
