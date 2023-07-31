import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppTenExpressionAnalyser {

    public static void main(String[] args) {
        System.out.println("Program start -----------------------");

        String expressionAfterOperation = "";

        System.out.println();

        Scanner userInput = new Scanner(System.in);

        System.out.print("Type some expression: ");

        String expression = userInput.nextLine();

        List<Element> elementList = createElementList(expression);

        /*
        every time we execute an operation we generate a new expression string
        that must be re-evaluated submitted to the entire process until it
        doesn't have pending operations anymore
         */

        while (expressionHasPendingOperation(elementList)) {
            expressionAfterOperation = evaluateElementList(elementList);
            elementList = createElementList(expressionAfterOperation);
        }


        System.out.println();

        System.out.println("The expression result is: " + expressionAfterOperation);

        System.out.println();

        System.out.println("Program end   -----------------------");
    }

    private static List<Element> createElementList(String expression) {
        List<Element> expressionElements = new ArrayList<>();

        String[] elementsAux = expression.split(" ");

        for (int c = 0; c < elementsAux.length; c++) {
            if (elementsAux[c].matches("[*/+-]"))
                expressionElements.add(new Element(elementsAux[c], ElementType.OPERATION));
            else expressionElements.add((new Element(elementsAux[c], ElementType.NUMBER)));
        }

        return expressionElements;

    }

    private static boolean expressionHasPendingOperation(List<Element> elementList) {
        for (Element element : elementList) {
            if (element.getValue().matches("[*/+-]")) return true;
        }
        return false;
    }

    private static String evaluateElementList(List<Element> expressionElements) {
        StringBuilder expressionAfterOperation = new StringBuilder();
        boolean keepSearching = true;
        int index = 0;
        Double operationResult = 0.0;

        while (keepSearching){

            if (expressionElements.get(index).getType().equals(ElementType.OPERATION)) {

                operationResult = performCalculation(expressionElements.get(index - 1).getValue(),expressionElements.get(index + 1).getValue(),expressionElements.get(index).getValue());

                keepSearching = false;

                updateElementList(expressionElements,index,operationResult);

            }

            index++;
        }

        for(Element e:expressionElements){
            expressionAfterOperation.append(e.getValue()).append(" ");
        }

        return expressionAfterOperation.toString().trim();
    }

    private static Double performCalculation(String elementOne,String elementTwo,String operation){
        Double numberOne = Double.parseDouble(elementOne);
        Double numberTwo = Double.parseDouble(elementTwo);

        if (operation.equals("*")) return numberOne * numberTwo;
        else if (operation.equals("/")) return numberOne / numberTwo;
        else if (operation.equals("+")) return numberOne + numberTwo;
        else if (operation.equals("-")) return numberOne - numberTwo;

        return null;
    }

    private static void updateElementList(List<Element> elementList, int indexToUpdate, Double operationResult){
        //updates the current element with the result of the operation
        elementList.get(indexToUpdate).setType(ElementType.NUMBER);
        elementList.get(indexToUpdate).setValue(String.valueOf(operationResult));

        //removes the next element
        elementList.remove(indexToUpdate + 1);
        //removes the previous element
        elementList.remove(indexToUpdate - 1);
    }

}

enum ElementType {
    NUMBER,OPERATION
}

class Element {
    private String value;
    private ElementType type;

    public Element(String value, ElementType type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ElementType getType() {
        return type;
    }

    public void setType(ElementType type) {
        this.type = type;
    }
}