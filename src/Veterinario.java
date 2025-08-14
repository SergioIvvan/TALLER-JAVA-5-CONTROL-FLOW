import java.util.Scanner;

public class Veterinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Qué tipo de animal es su mascota?: ");
        String tipoAnimal = scanner.nextLine().toLowerCase();

        System.out.println("Ingrese la edad del animal en años: ");
        int edadAnimal = scanner.nextInt();

        String veterinario = "";

        switch (tipoAnimal) {
            case "perro":
                veterinario = "Dr. Sergio, especialista en caninos";
                break;
            case "gato":
                veterinario = "Dra. Sara, especialista en felinos";
                break;
            case "ave":
                veterinario = "Dr. Felipe, especialista en aves";
                break;
            case "otro":
                veterinario = "Dra. Laura, Veterinario general";
                break;
            default:
                veterinario = "Pendiente de asignación";
                break;
        }

        String vacuna = "";
        if (edadAnimal < 5) {
            vacuna = "No necesita vacuna";
        } else {
            vacuna = "Requiere vacuna adicional.";
        }

        System.out.println("Veterinario asignado: " + veterinario);
        System.out.println("Edad del animal: " + edadAnimal + " años");
        System.out.println("Recomendación de vacuna: " + vacuna);

        scanner.close();
    }
}
