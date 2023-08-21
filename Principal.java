import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        final int NUMERO_SECRETO = 1234;
        final int INTENTOS_MAXIMOS = 3;

        Scanner sc = new Scanner(System.in);
        int intentos = 0;

        System.out.println("Bienvenido al juego de adivinanza de números.");
        System.out.println("Tienes " + INTENTOS_MAXIMOS + " intentos para adivinar el número secreto.");

        while (intentos < INTENTOS_MAXIMOS) {
            System.out.print("Intento " + (intentos + 1) + "/" + INTENTOS_MAXIMOS +
                    ": ¿Cuál es el número secreto? ");
            int numeroIngresado = sc.nextInt();

            if (numeroIngresado == NUMERO_SECRETO) {
                System.out.println("¡Adivinaste! ¡Eres un ganador!");
                break;
            } else {
                System.out.println("No es el número correcto. ¡Inténtalo de nuevo!");
            }

            intentos++;
        }

        if (intentos == INTENTOS_MAXIMOS) {
            System.out.println("¡Ups, has agotado tus intentos! El número secreto era " + NUMERO_SECRETO);
        }

        System.out.println("Gracias por jugar.");
        sc.close();
    }
}