import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppEightNameGeneratorTest {

    AppEightNameGenerator nameGenerator = new AppEightNameGenerator();

    @Test
    void generateName() {
        //given
        String motherName = "Jussara";
        String fatherName = "Aloísio";

        //when
        List<String> babyName = nameGenerator.generateName(motherName,fatherName);

        //then
        assertTrue(babyName.contains("Alosara"));
    }
}