package auxliar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AuxiliarPalabrasTest {

    @Test
    void obtenerNumeroLetras() {
        //assertEquals();
        assertEquals(0, AuxiliarPalabras.obtenerNumeroLetras(""));
        assertEquals(4, AuxiliarPalabras.obtenerNumeroLetras("coco"));
        assertEquals(-1, AuxiliarPalabras.obtenerNumeroLetras(null));
    }

    @Test
    void empiezaPorVocal() {
        assertFalse(AuxiliarPalabras.empiezaPorVocal(null));
        assertFalse(AuxiliarPalabras.empiezaPorVocal(""));
        assertFalse(AuxiliarPalabras.empiezaPorVocal("mendigo"));
        assertFalse(AuxiliarPalabras.empiezaPorVocal("Mendigo"));
        assertTrue(AuxiliarPalabras.empiezaPorVocal("amigo"));
        assertTrue(AuxiliarPalabras.empiezaPorVocal("Amigo"));
        assertTrue(AuxiliarPalabras.empiezaPorVocal("Ávila"));
        assertTrue(AuxiliarPalabras.empiezaPorVocal("o"));
        assertTrue(AuxiliarPalabras.empiezaPorVocal("ó"));
        assertTrue(AuxiliarPalabras.empiezaPorVocal("Ó"));
        assertTrue(AuxiliarPalabras.empiezaPorVocal("O"));
    }

    @Test
    void acabaEnVocal() {
        assertFalse(AuxiliarPalabras.acabaEnVocal(null));
        assertFalse(AuxiliarPalabras.acabaEnVocal(""));
        assertFalse(AuxiliarPalabras.acabaEnVocal("amor"));
        assertFalse(AuxiliarPalabras.acabaEnVocal("AMOR"));
        assertTrue(AuxiliarPalabras.acabaEnVocal("amigo"));
        assertTrue(AuxiliarPalabras.acabaEnVocal("AMIGO"));
        assertTrue(AuxiliarPalabras.acabaEnVocal("olé"));
        assertTrue(AuxiliarPalabras.acabaEnVocal("o"));
        assertTrue(AuxiliarPalabras.acabaEnVocal("ó"));
        assertTrue(AuxiliarPalabras.acabaEnVocal("Ó"));
        assertTrue(AuxiliarPalabras.acabaEnVocal("O"));

    }

    @Test
    void obtenerNumeroVocales() {
        assertEquals(0, AuxiliarPalabras.obtenerNumeroVocales(""));
        assertEquals(2, AuxiliarPalabras.obtenerNumeroVocales("coco"));
        assertEquals(2, AuxiliarPalabras.obtenerNumeroVocales("COCO"));
        assertEquals(0, AuxiliarPalabras.obtenerNumeroVocales("SMRV"));
        assertEquals(-1, AuxiliarPalabras.obtenerNumeroVocales(null));
        assertEquals(1, AuxiliarPalabras.obtenerNumeroVocales("á"));

    }

    @Test
    void contieneLetra() {
        assertFalse(AuxiliarPalabras.contieneLetra(null,' '));
        assertFalse(AuxiliarPalabras.contieneLetra("", ' '));
        assertFalse(AuxiliarPalabras.contieneLetra("amor", 'z'));
        assertFalse(AuxiliarPalabras.contieneLetra("AMOR", 'Z'));
        assertTrue(AuxiliarPalabras.contieneLetra("amigo", 'a'));
        assertTrue(AuxiliarPalabras.contieneLetra("AMIGO", 'O'));
    }

    @Test
    void esPalindromo() {
        assertFalse(AuxiliarPalabras.esPalindromo("abcd"));
        assertFalse(AuxiliarPalabras.esPalindromo(null));
        assertFalse(AuxiliarPalabras.esPalindromo(""));
        assertTrue(AuxiliarPalabras.esPalindromo("ama"));
        assertTrue(AuxiliarPalabras.esPalindromo("Seres"));
    }
    @Test
    void sonIguales() {
        assertFalse(AuxiliarPalabras.sonIguales(null, "hola"));
        assertFalse(AuxiliarPalabras.sonIguales("hola", "hello"));
        assertTrue(AuxiliarPalabras.sonIguales("hola", "hola"));
        assertTrue(AuxiliarPalabras.sonIguales("Jaén", "jaén"));
        assertFalse(AuxiliarPalabras.sonIguales("hola", null));
        assertFalse(AuxiliarPalabras.sonIguales("", null));
        assertTrue(AuxiliarPalabras.sonIguales("", ""));
        assertFalse(AuxiliarPalabras.sonIguales(null, null));
    }
}





