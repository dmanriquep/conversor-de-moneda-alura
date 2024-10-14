import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Bienvenido/a al Conversor de Moneda\n");
            System.out.println("Seleccione una opción de conversión:");
            System.out.println("1. Dólar a Peso Argentino");
            System.out.println("2. Peso Argentino a Dólar");
            System.out.println("3. Dólar a Real Brasileño");
            System.out.println("4. Real Brasileño a Dólar");
            System.out.println("5. Dólar a Peso Colombiano");
            System.out.println("6. Peso Colombiano a Dólar");
            System.out.println("7. Salir");

            int opcion = lectura.nextInt();

            if (opcion == 7) {
                salir = true;
                System.out.println("Programa terminado.");
                continue;
            }

            if (opcion < 1 || opcion > 6) {
                System.out.println("Opción no válida. Por favor, seleccione una opción entre 1 y 7.");
                continue;
            }

            System.out.println("Ingrese el valor a convertir:");
            double valor = lectura.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println(Conversiones.convertir("USD", "ARS", valor));
                    break;
                case 2:
                    System.out.println(Conversiones.convertir("ARS", "USD", valor));
                    break;
                case 3:
                    System.out.println(Conversiones.convertir("USD", "BRL", valor));
                    break;
                case 4:
                    System.out.println(Conversiones.convertir("BRL", "USD", valor));
                    break;
                case 5:
                    System.out.println(Conversiones.convertir("USD", "COP", valor));
                    break;
                case 6:
                    System.out.println(Conversiones.convertir("COP", "USD", valor));
                    break;
            }
        }

        lectura.close();
    }
}