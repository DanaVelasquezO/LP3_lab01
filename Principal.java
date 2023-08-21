import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do {
            vida++;
            System.out.print("Vida:" + vida + "\t¿Cuál es el número secreto? ");
            rp = sc.nextInt();
            if (rp == 1234)
                fl = true;
        } while (vida < 3 && !fl);

        if (fl) {
            System.out.println("¡Adivinaste! ¡Eres un ganador!");
            mostrarPremio();
        } else {
            System.out.println("¡Ups, perdiste... Inténtalo la próxima vez!");
        }
    }

    public static void mostrarPremio() {
        System.out.println("¡Felicidades! Has ganado un premio.");
        System.out.println("Tu premio es una tarjeta de regalo de $50.");
    }
}
