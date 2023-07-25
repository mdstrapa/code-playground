import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppEightNameGeneratorTest {

    @Test
    void shoudlGenerateCorrectListNames1() {
        //given
        String motherName = "Jussara";
        String fatherName = "Aloísio";

        //when
        List<String> babyName = AppEightNameGenerator.generateName(motherName,fatherName);

        //then
        assertTrue(babyName.contains("Alosara"));
    }

    @Test
    void shoudlGenerateCorrectListNames2() {
        //given
        String motherName = "Patrícia";
        String fatherName = "Roberto";

        //when
        List<String> babyName = AppEightNameGenerator.generateName(motherName,fatherName);

        //then
        assertTrue(babyName.contains("Robícia"));
    }
}