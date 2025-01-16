package claves;

import java.util.Random;

/**
 * <p>Clase Helper con varios metodos auxiliares</p>
 * <p>Uno de ellos genera claves seguras</p>
 * @author Manuel
 * @version 1.0
 */
public final class HelperClaves {

    private final static Random random = new Random();
    private final static char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y','F', 'P', 'D', 'X', 'B',
            'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E', 'Ñ', 'I', 'O'};
    private final static char[] caracterEspeciales = {'\\', '!', '"','\'', '#', '·', '$', '%', '&', '¬',
            '/', '(', ')', '=', '?', '¿', '@', '+', '*', '-','[', ']', '{'};

    private HelperClaves() {
    }

    /**
     * <p>Metodo que genera una clave segura</p>
     * <p>Una clave es segura si cumple los siguientes requisitos</p>
     * <ul>
     *     <li>Tiene al menos cuatro caracteres</li>
     *     <li>Tiene al menos un digito</li>
     *     <li>Tiene al menos una letra minuscula</li>
     *     <li>Tiene al menos una letra mayuscula</li>
     *     <li>Tiene al menos un caracter especial</li>
     * </ul>
     * @param tamanno que define el nº de caracteres que tiene la clave
     * @return la clave, en el caso que el parametro tamanno es inferior a 4, devuelve un null
     */
    public final static String crearClave (int tamanno) {
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

    /*public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(crearClave(i));
        }
    }*/
}









