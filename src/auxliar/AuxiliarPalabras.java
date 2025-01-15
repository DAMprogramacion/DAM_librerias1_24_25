package auxliar;

import java.util.List;

/**
 * <p>Clase con métodos para el análisis de una palabra o varias palabras</p>
 * @author manuel
 * @version 1.0
 */
public class AuxiliarPalabras {
    /**
     * Metodo que devuelve la longitud de la palabra que se la pasa como parametro
     * @param palabra la cadena a analizar
     * @return la longitud de la palabra
     * <p>en el caso que palabra sea null devuelve -1</p>,
     * <p>cadeba vacía devuelve 0</p>
     * <p>Ejemplo: coco: devuelve 4</p>
     */
    public static int obtenerNumeroLetras(String palabra) {
        if (palabra == null)
            return -1;
        return palabra.length();
    }

    /**
     * Metodo que nos dice si una palabra empieza por vocal
     * @param palabra la palabra a analizar
     * @return true si empieza por vocal, independientemente de que esté acentuada o sea miníscula.
     * False para el resto. En el caso que el parametro sea null o cadena vacía devuelve false.
     */
    public static boolean empiezaPorVocal (String palabra) {
        if (palabra == null || palabra.length() == 0)
            return false;
        char letra = palabra.toLowerCase().charAt(0);
        boolean condicion = letra == 'a' || letra == 'á' || letra == 'e' || letra == 'é'
            || letra == 'i' || letra == 'í' || letra == 'o' || letra == 'ó'
            || letra == 'u' || letra == 'ú';
        return condicion;
        /*if (palabra == null)
            return false;
        return palabra.toLowerCase().matches("[aáeéiíoóuú].*");*/
    }
    /**
     * Metodo que nos dice si una palabra acaba por vocal
     * @param palabra la palabra a analizar
     * @return true si acaba por vocal, independientemente de que esté acentuada o sea miníscula.
     * False para el resto. En el caso que el parametro sea null o cadena vacía devuelve false.
     */
    public static boolean acabaEnVocal (String palabra) {
        if (palabra == null || palabra.length() == 0)
            return false;
        String palabraMinuscula = palabra.toLowerCase();
        boolean condicion = palabraMinuscula.endsWith("a") || palabraMinuscula.endsWith("á") ||
                palabraMinuscula.endsWith("e") || palabraMinuscula.endsWith("é") ||
                palabraMinuscula.endsWith("i") || palabraMinuscula.endsWith("í") ||
                palabraMinuscula.endsWith("o") || palabraMinuscula.endsWith("ó") ||
                palabraMinuscula.endsWith("u") || palabraMinuscula.endsWith("ú");
        return condicion;
        /*if (palabra == null)
            return false;
        return palabra.toLowerCase().matches(".*[aáeéiíoóuú]");*/
    }

    /**
     * Metodo que nos dice el nº de vocales de una palabra
     * @param palabra la palabra a analizar
     * @return el número de vocales, independientemente si están en mayúsculas o minúsculas o acentuadas.
     * Si el parametro es null, devolvemos -1, cadena vacia devuelve 0
     */
    public static int obtenerNumeroVocales (String palabra) {
        if (palabra == null)
            return -1;
       /* if (palabra.isEmpty())
            return 0;*/
        List<Character> vocales = List.of('a', 'A', 'á', 'Á', 'e', 'E', 'é', 'É',
                'i', 'I', 'í', 'Í', 'o', 'O', 'ó', 'Ó', 'u', 'U', 'ú', 'Ú');
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (vocales.contains(palabra.charAt(i)))
                contador++;
        }
        return contador;
    }

    /**
     * Metodo que nos dice si una palabra tiene una letra determinado
     * @param palabra la palabra a analizar
     * @param letra la letra a buscar
     * @return true si la palabra contenga dicha letra independientemente de mayúscula o minúscula.
     * El resto devuelve false, en el caso de que el parametro sea null, devuelve false
     */
    public static boolean contieneLetra(String palabra, char letra) {
        if (palabra == null)
            return false;
        return palabra.toLowerCase().contains((letra + "").toLowerCase());
    }

    /**
     * Metodo que nos dice si una palabra es palindromo o no, es decir se lee igual de izquierdas que a derechas
     * @param palabra la palabra a analizar
     * @return true si es palindromo, independientemente de mayúscula o minúsculas, false para el resto.
     * Por ejemplo Ama devuelve true, ama devuelve true, amor devuelve false, oso devuelve true, osó devuelve false
     */
    public static boolean esPalindromo (String palabra) {
        if (palabra == null || palabra.isEmpty())
            return false;
        StringBuilder builder = new StringBuilder(palabra);
        builder.reverse();
        String palabraReverse = builder.toString();
        return palabra.equalsIgnoreCase(palabraReverse);
    }

    /**
     * Metodo que nos dice si dos palabras son iguales o no
     * @param palabra1 palabra a comparar
     * @param palabra2 la otra palabra a comparar
     * @return true si son iguales, independientemente de mayúsculas o minúscular. False para el resto
     * Amar y amar devolvería true, oso y osó devuelve false
     */
    public static boolean sonIguales (String palabra1, String palabra2) {
        if (palabra1 == null)
            return false;
        return palabra1.equalsIgnoreCase(palabra2);
    }

}


