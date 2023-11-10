import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppGetCMDBCodeTest {

    @Test
    void shouldReturnCorrectCodeFromEntireLine() {
        String originalString1 = "\"CRK - PLATAFORMA DE NEGÓCIOS (PROGRESS) (CMDB-1193)\",";
        String originalString2 = "\"SERVIÇOS DE CRÉDITO - INTEGRAÇÃO REL. MAIORES DEVE (CMDB-1935)\",";

        String expectedResult1 = "CMDB-1193";
        String expectedResult2 = "CMDB-1935";

        String actualResult1 = AppGetCMDBCode.getId(originalString1);
        String actualResult2 = AppGetCMDBCode.getId(originalString2);

        assertEquals(expectedResult1,actualResult1);
        assertEquals(expectedResult2,actualResult2);
    }
}