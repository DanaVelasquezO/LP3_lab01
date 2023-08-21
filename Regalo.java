public class Regalo {
    public static String elegir(int vida) {
        String gift = switch (vida) {
            case 1 -> "Un pasaje al caribe";
            case 2 -> "Un visita al museo más cercano a tu casa";
            case 3 -> "Una entrada al cine";
            default -> "Sin regalo, inténtalo la próxima vez";
        };
        return gift;
    }
}
