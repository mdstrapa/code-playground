import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppTenExpressionAnaliser {

    public static void main(String[] args) {
        System.out.println("Program start -----------------------");

        System.out.println();

        Scanner userInput = new Scanner(System.in);

        System.out.print("Type some expression: ");

        String expression = userInput.nextLine();

        System.out.println();

        System.out.println("The expression you typed is: '" + expression + "'");

        System.out.println();

        List<Element> elementList = evaluateExpression(expression);

        elementList.forEach(element -> System.out.println("Element type " + element.getType() + " and value " + element.getValue()));

        determineOperationOrder(elementList)
                .forEach(operation -> System.out.println("Operation: '" + operation.getNumberOne() + " " + operation.getOperationType() + " " + operation.getNumberTwo() + "'"));


        System.out.println();

        System.out.println("Program end   -----------------------");
    }

    private static List<Element> evaluateExpression(String expression){
        List<Element> expressionElements = new ArrayList<>();

        String[] elementsAux = expression.split(" ");

        for(int c=0;c<elementsAux.length;c++){
            if(elementsAux[c].matches("[*/+-]")) expressionElements.add(new Element(elementsAux[c],ElementType.OPERATION));
            else expressionElements.add((new Element(elementsAux[c],ElementType.NUMBER)));
        }

        return  expressionElements;

    }

    private static List<Operation> determineOperationOrder(List<Element> elementList){
        //elementList
        //        .stream()
        //        .filter(e -> e.getType().equals(ElementType.OPERATION))
        //        .forEach(e -> System.out.println("This is an operation  " + e.getValue()));

        List<Operation> operationList = new ArrayList<>();

        for(int e=0;e<elementList.size();e++){
            Element element = elementList.get(e);
            if(element.getType().equals(ElementType.OPERATION))
                operationList.add(new Operation(
                        Double.valueOf(elementList.get(e-1).getValue()),
                        String.valueOf(element.getValue()),
                        Double.valueOf(elementList.get(e+1).getValue())
                        ));
        }

        return operationList;

    }
}

enum ElementType {
    NUMBER,VARIABLE,OPERATION
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

class Operation{
    private Double numberOne;
    private String operationType;
    private Double numberTwo;

    public Operation(Double numberOne, String operationType, Double numberTwo) {
        this.numberOne = numberOne;
        this.operationType = operationType;
        this.numberTwo = numberTwo;
    }

    public Double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(Double numberOne) {
        this.numberOne = numberOne;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(Double numberTwo) {
        this.numberTwo = numberTwo;
    }
}