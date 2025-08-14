import java.util.Scanner;

public class Parqueadero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tipo de vehiculo (auto, moto, bicicleta): ");
        String tipoVehiculo = scanner.next().toLowerCase();

        System.out.println("Ingrese la hora de llegada en formato 24 horas (0-24): ");
        int horaLlegada = scanner.nextInt();

        double costoBase;

        switch (tipoVehiculo) {
            case "auto":
                costoBase = 10000;
                break;
            case "moto":
                costoBase = 5000;
                break;
            case "bicicleta":
                costoBase = 2000;
                break;
            default:
                System.out.println("Vehiculo no reconocido");
                costoBase =0;
                break;
        }


        double costoFinal = costoBase;

        if (horaLlegada >= 20 && horaLlegada <=24){
            costoFinal = costoBase * 1.20;

        }

        System.out.println("Costo total del parqueo: $" + costoFinal);













    }
}
