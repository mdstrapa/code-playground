import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppJavaStackTest {

    AppJavaStack app = new AppJavaStack();


    @BeforeEach
    void setUp(){
        app.clearOperationStack();
        Operation op1 = new Operation("4 + 5");
        Operation op2 = new Operation("4 + 8");
        app.addOperation(op1);
        app.addOperation(op2);
    }


    @Test
    void shouldAddOneOperationToStack() {
        Operation op3 = new Operation("25 / 9");
        app.addOperation(op3);
        int stackSize = app.getOperationStackSize();
        assertEquals(3,stackSize);
    }

    @Test
    void shouldExecuteAndRemoveLastOperationFromStack() {
        app.executeLastOperation();
        int stackSize = app.getOperationStackSize();
        assertEquals(1,stackSize);
    }


    @Test
    void shouldBuildCorrectStackForExpression(){
        app.clearOperationStack();
        String expression = "{[()()]}";
        app.buildStack(expression);
        int stackSize = app.getOperationStackSize();
        assertEquals(0,stackSize);
    }
}