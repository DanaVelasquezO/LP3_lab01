import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        final int NUMERO_SECRETO = 1234;
        final int INTENTOS_MAXIMOS = 3;

        Scanner sc = new Scanner(System.in);
        int intentos = 0;

        while (intentos < INTENTOS_MAXIMOS) {
            System.out.print("Intento " + (intentos + 1) + "/" + INTENTOS_MAXIMOS +
                    ": ¿Cual es el número secreto? ");
            int numeroIngresado = sc.nextInt();

            if (numeroIngresado == NUMERO_SECRETO) {
                System.out.println("¡Adivinaste! ¡Eres un ganador!");
                break;
            } else {
                System.out.println("No es el numero correcto. ¡Intentalo de nuevo!");
            }

            intentos++;
        }

        if (intentos == INTENTOS_MAXIMOS) {
            System.out.println("¡Ups, has agotado tus intentos! El numero secreto era " + NUMERO_SECRETO);
        }

        sc.close();
    }
}
