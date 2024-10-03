package aerolineaTest;

import aerolinea.Aerolinea;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AerolineaTest {

    @ParameterizedTest
    @CsvSource({
            "'La Paz', 2, 29, 5, 2023, 'Lunes 29 Mayo 2023 existen 2 pasajes para La Paz'",
            "'La Paz', 5, 29, 5, 2023, 'No existen suficientes pasajes para La Paz'"
    })
    public void testReservaVuelo(String destino, int numeroPasajes, int dia, int mes, int gestion, String expected) {
        Aerolinea aerolinea = new Aerolinea();
        String resultado = aerolinea.reservaVuelo(destino, numeroPasajes, dia, mes, gestion);
        Assertions.assertEquals(expected, resultado);
    }
}
