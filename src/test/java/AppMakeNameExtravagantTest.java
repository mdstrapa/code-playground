import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppMakeNameExtravagantTest {

    AppMakeNameExtravagant appMakeNameExtravagant = new AppMakeNameExtravagant();

    @Test
    void should_Turn_Name_Into_NewName() {
        String originalName = "FABIELE";
        String expectedName = "PHABYELLEH";
        String actualName = appMakeNameExtravagant.makeExtravagant(originalName).getExtravagantName();
        assertEquals(expectedName, actualName);

        originalName = "EDIVALDO";
        expectedName = "EDYWALLDOH";
        actualName = appMakeNameExtravagant.makeExtravagant(originalName).getExtravagantName();
        assertEquals(expectedName, actualName);

        originalName = "CAROLINA";
        expectedName = "KAROLLYNNAH";
        actualName = appMakeNameExtravagant.makeExtravagant(originalName).getExtravagantName();
        assertEquals(expectedName, actualName);

        originalName = "CATIANE";
        expectedName = "KATYANNEH";
        actualName = appMakeNameExtravagant.makeExtravagant(originalName).getExtravagantName();
        assertEquals(expectedName, actualName);

        originalName = "NADINE";
        expectedName = "NADYNNEH";
        actualName = appMakeNameExtravagant.makeExtravagant(originalName).getExtravagantName();
        assertEquals(expectedName, actualName);

        originalName = "ANDERSON";
        expectedName = "ANNDERSON";
        actualName = appMakeNameExtravagant.makeExtravagant(originalName).getExtravagantName();
        assertEquals(expectedName, actualName);
    }
}