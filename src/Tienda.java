import java.util.Scanner;

public class Tienda {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de prenda (Camisa, pantalon, chaqueta): ");
        String tipoPrenda = scanner.next().toLowerCase();

        System.out.println("Ingrese la cantidad de prendas que desea comprar: ");
        int cantidadPrendas = scanner.nextInt();

        double precioUnitario;

        switch (tipoPrenda){
            case "camisa":
                precioUnitario = 20000;
                break;
            case "pantalon":
                precioUnitario = 35000;
                break;
            case "chaqueta":
                precioUnitario = 60000;
                break;
            default:
                System.out.println("Prenda no reconocida");
                precioUnitario = 0;
                break;
        }
        double total = precioUnitario * cantidadPrendas;

        if (cantidadPrendas > 5){
            total = total * 0.85;
        }
        System.out.println("El total a pagar es: "+ total);

        scanner.close();
    }
}