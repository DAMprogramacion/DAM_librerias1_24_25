package claves;

import java.util.Random;

public class HelperClaves {
    private static Random random = new Random();
    private static char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y','F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'Ñ', 'I', 'O'};
    public static char[] caracterEspeciales = {'\\', '!', '"','\'', '#', '·', '$', '%', '&', '¬',
            '/', '(', ')', '=', '?', '¿', '@', '+', '*', '-','[', ']', '{'};
    public static String crearClave (int tamanno) {
        if (tamanno < 4)
            return null;
        StringBuilder builder = new StringBuilder();
        while (true) {
            builder.append(obtenerNumeroAleatorio());
            builder.append(obtenerLetraMinuscula());
            builder.append(obtenerLetraMayuscula());
            builder.append(obtenerCaracterEspecial());
            if (builder.length() >= tamanno)
                break;
        }
        System.out.println("cadena original " + builder.toString());
        builder = intercambiarLetras(builder);
        return builder.toString();
    }

    private static StringBuilder intercambiarLetras(StringBuilder builder) {
        for (int i = 0; i < builder.length(); i++) {
            int posicion1 = random.nextInt(builder.length());
            char char1 = builder.charAt(posicion1);
            int posicion2 = random.nextInt(builder.length());
            char char2 = builder.charAt(posicion2);
            builder.setCharAt(posicion1, char2);
            builder.setCharAt(posicion2, char1);
        }
        return builder;
    }

    private static char obtenerCaracterEspecial() {
        return caracterEspeciales[random.nextInt(caracterEspeciales.length)];
    }

    private static char obtenerLetraMayuscula() {
        return letras[random.nextInt(letras.length)];
    }

    private static char obtenerLetraMinuscula() {
        //return (obtenerLetraMayuscula() + "").toLowerCase().charAt(0);
        return Character.toLowerCase(obtenerLetraMayuscula());
    }

    private static int obtenerNumeroAleatorio() {
        return random.nextInt(10);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(crearClave(i));
        }
    }
}









