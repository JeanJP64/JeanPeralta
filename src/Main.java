//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear perro
        System.out.print("Informacion de la especie: ");
        String nombre = scanner.nextLine();

        System.out.print("Raza del perro: ");
        String raza = scanner.nextLine();

        System.out.print("Edad del perro (en años): ");
        int edad = scanner.nextInt();

        Mascotas masc = new Mascotas(nombre, raza, edad);


        System.out.println("\n¿Qué deseas hacer con " + nombre + "?");
        System.out.println("1. Informacion de la especie");
        System.out.println("2. Vender, maximo 50 unidades para vender");
        System.out.println("3. Comprar mascota minimo 5 unidades");
        System.out.println("4.Buscar especie");
        System.out.println("5. Especie menos vendida");








        }
    }
